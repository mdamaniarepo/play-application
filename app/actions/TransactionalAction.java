package actions;

import java.util.concurrent.CompletionStage;

import play.Logger;
import play.mvc.Action;
import play.mvc.Http.Context;
import play.mvc.Result;

public class TransactionalAction extends Action.Simple {

	@Override
	public CompletionStage<Result> call(Context ctx) {
		Logger.info("START: Starting transaction: " + ctx);
		CompletionStage<Result> result = delegate.call(ctx);
		Logger.info("END: Ending transaction: " + ctx);
		return result;
	}

}

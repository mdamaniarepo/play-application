package actions;

import java.util.concurrent.CompletionStage;

import play.Logger;
import play.mvc.Action;
import play.mvc.Http.Context;
import play.mvc.Result;

public class LoggingAction extends Action.Simple {

	@Override
	public CompletionStage<Result> call(Context ctx) {
		Logger.info("START: Executing action: " + ctx);
		CompletionStage<Result> result = delegate.call(ctx);
		Logger.info("END: Executing action: " + ctx);
		return result;
	}

}

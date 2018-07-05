# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

INSERT INTO TAG (id, name) values (1, 'lightweight');
INSERT INTO TAG (id, name) values (2, 'metal');
INSERT INTO TAG (id, name) values (3, 'plastic');


INSERT INTO  ADDRESS (id, street, number, postal_code, city, country) values (1, 'MG Road', '29', '560001', 'Bengaluru', 'India');
INSERT INTO  ADDRESS (id, street, number, postal_code, city, country) values (2, 'ITPL Road', '39', '560066', 'Bengaluru', 'India');


INSERT INTO WAREHOUSE (id, name, address_id) values (1, 'MG Road Warehouse', 1);
INSERT INTO WAREHOUSE (id, name, address_id) values (2, 'White Field Warehouse', 2);
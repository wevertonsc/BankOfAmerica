-- Populate table client --
insert into client(id, name, email) values(1, 'Leon Tolstoi', 'leon.tolstoi@mail.com');
insert into client(id, name, email) values(2, 'Anthon Tchekhov', 'anthon.tchekov@mail.com');
insert into client(id, name, email) values(3, 'Nicolai Gogol', 'niocolai.gogol@mail.com');

-- Populate table brand --
insert into brand(id,name) values(1, 'visa');
insert into brand(id, name) values(2, 'mastercard');
insert into brand(id, name) values(3, 'amex');
insert into brand(id, name) values(4, 'maestro');

-- Populate table messages --
insert into messages(id, message, description) values(1, 'invalid credicard number', 'The number entered is invalid');
insert into messages(id, message, description) values(2, 'invalid email', 'The email is wrong');
insert into messages(id, message, description) values(3, 'expired card', 'The credit card used has expired');
insert into messages(id, message, description) values(4, 'transation not allowed','Payment authorization has been declined at issuing bank');
insert into messages(id, message, description) values(5, 'insuficient funds', 'There are not enough funds in the limit credit card to complete this payment');
insert into messages(id, message, description) values(6, 'approved!', 'Operation approved!');

-- Fake credit card numbers for all major brands --
-- These credit card numbers DO NOT work! They are for testing purposes only. Without a valid owner name, an expiration date and a valid CVV code,
-- they can't be used for real transactions. You should use these numbers only to test your validation strategies and for bogus data. Note that
-- the algorithm used here is freely available across the web even Wikipedia.org. These numbers were generated randomly.You can refresh the page
-- to get new numbers.
-- https://www.freeformatter.com/credit-card-number-generator-validator.html

-- VISA:
-- 4882818360469654
-- 4539270444335476
-- 4052463528590172380

-- MasterCard:
-- 5389366208900287
-- 2720992591649929
-- 5220832993788792

-- American Express (AMEX):
-- 343566331976379
-- 370816081501471
-- 37292407224362

-- Populate table card --
insert into card(id, number, expiration, cvv, limits, balance, brand_id, client_id) values(1, '4882818360469654', '12/2024', '000', 10000.00, 10000.00, 1, 1);
insert into card(id, number, expiration, cvv, limits, balance, brand_id, client_id) values(2, '4539270444335476', '12/2024', '000', 10000.00, 10000.00, 1, 2);
insert into card(id, number, expiration, cvv, limits, balance, brand_id, client_id) values(3, '4052463528590172380', '12/2024', '000', 10000.00, 10000.00, 1, 3);

insert into card(id, number, expiration, cvv, limits, balance, brand_id, client_id) values(4, '5389366208900287', '12/2024', '000', 10000.00, 10000.00, 2, 1);
insert into card(id, number, expiration, cvv, limits, balance, brand_id, client_id) values(5, '2720992591649929', '12/2024', '000', 10000.00, 10000.00, 2, 2);
insert into card(id, number, expiration, cvv, limits, balance, brand_id, client_id) values(6, '5220832993788792', '12/2024', '000', 10000.00, 10000.00, 2, 3);

insert into card(id, number, expiration, cvv, limits, balance, brand_id, client_id) values(7, '343566331976379', '12/2024', '000', 10000.00, 10000.00, 3, 1);
insert into card(id, number, expiration, cvv, limits, balance, brand_id, client_id) values(8, '370816081501471', '12/2024', '000', 10000.00, 10000.00, 3, 2);
insert into card(id, number, expiration, cvv, limits, balance, brand_id, client_id) values(9, '37292407224362', '12/2024', '000', 10000.00, 10000.00, 3, 3);

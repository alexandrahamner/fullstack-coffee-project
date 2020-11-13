USE coffee_inventory;

DROP TABLE IF EXISTS coffees;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
   id INT UNSIGNED NOT NULL AUTO_INCREMENT,
   username VARCHAR(30) NOT NULL,
   email VARCHAR(100) NOT NULL,
   password VARCHAR(24) NOT NULL,
   PRIMARY KEY (id)
);

CREATE TABLE coffees (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id INT UNSIGNED NOT NULL,
    coffee_name VARCHAR(240) NOT NULL,
    roasts VARCHAR(50) NOT NULL,
    description TEXT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users(id)
        ON DELETE CASCADE
);
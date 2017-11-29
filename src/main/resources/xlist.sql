CREATE TABLE users
(
  id       INT AUTO_INCREMENT PRIMARY KEY,
  email    VARCHAR(150) NOT NULL,
  password VARCHAR(150) NOT NULL,
  name     VARCHAR(50)  NOT NULL,
  date     DATE         NOT NULL,
  role     INT(1)       NOT NULL
  COMMENT ' 1 is Admin, 2 is User, 0 is Blocked',
  CONSTRAINT users_email_uindex
  UNIQUE (email)
)
  COMMENT 'all users';

INSERT INTO `users` (`email`, `password`, `name`, `date`, `role`)
VALUES ("user1@ukr.net", "1111", "user1", "2017-11-28", 1);

INSERT INTO `users` (`email`, `password`, `name`, `date`, `role`)
VALUES ("user2@ukr.net", "1111", "user2", "2017-11-28", 1);

INSERT INTO `users` (`email`, `password`, `name`, `date`, `role`)
VALUES ("user3@ukr.net", "1111", "user3", "2017-11-28", 1);

INSERT INTO `users` (`email`, `password`, `name`, `date`, `role`)
VALUES ("user4@ukr.net", "1111", "user4", "2017-11-28", 1);

INSERT INTO `users` (`email`, `password`, `name`, `date`, `role`)
VALUES ("user5@ukr.net", "1111", "user5", "2017-11-28", 1);

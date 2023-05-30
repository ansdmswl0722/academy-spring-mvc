CREATE TABLE IF NOT EXISTS `Users`(
    `user_id` VARCHAR(40) NOT NULL,
    `password` VARCHAR(40) NOT NULL,
    `age` INT,
    `name` VARCHAR(40),
    `img` VARCHAR(300),
    PRIMARY KEY(`user_id`)
);

MERGE INTO `Users` key(`user_id`) VALUES ('user13','1234',30,'monomono');
MERGE INTO `Users` key(`user_id`) VALUES ('admin','1234',0,'admin');
CREATE TABLE IF NOT EXISTS `Posts` (
    `post_id` bigint NOT NULL,
    `title` TEXT NOT NULL,
    `content` TEXT NOT NULL,
    `user_id` VARCHAR(40) NOT NULL,
    PRIMARY KEY(`post_id`)
);

MERGE INTO `Posts` key(`post_id`) VALUES (1,'memo','hi HR','user13');
MERGE INTO `Posts` key(`post_id`) VALUES (2,'memo2','im so mad','user13');


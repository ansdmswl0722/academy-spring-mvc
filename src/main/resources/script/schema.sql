drop table If exists birth_death_report_resident;
drop table If exists family_relationship;
drop table If exists household_movement_address;
drop table If exists household_composition_resident;
drop table If exists household;
drop table If exists certificate_issue;
drop table if exists resident;
drop table if exists User;
drop table if exists Board_Posts;
drop table if exists Board_Users;

CREATE TABLE Board_Users(
    user_id VARCHAR(40) NOT NULL,
    password VARCHAR(40) NOT NULL,
    age INT,
    name VARCHAR(40),
    profileFileName VARCHAR(300),
    created_at datetime not null,
    role VARCHAR(50),

    PRIMARY KEY(user_id)
);

insert into Board_Users
values ('admin','1234',30,'admin','1234.png','2012-03-15 14:59:00','admin');
insert into Users
values ('moon','5678',30,'moon','5678.png','2012-03-15 15:59:00','moon');
commit;

CREATE TABLE Board_Posts (
    post_id Bigint NOT NULL,
    title TEXT NOT NULL,
    content TEXT NOT NULL,
    created_at datetime null,
    user_id VARCHAR(40) NOT NULL,
    PRIMARY KEY(`post_id`),
    FOREIGN KEY (user_id) REFERENCES
);
insert into Board_Posts
values (1,'열심히 하자','todo1 : string-boot day 과제 끝내기','2023-05-14 17:30:00','moon');
insert into Board_Posts
values (2,'하이큐 리뷰','시작5분만에 독백멘트에 눈을 감았다...','2023-05-15 17:30:00','admin');
commit;




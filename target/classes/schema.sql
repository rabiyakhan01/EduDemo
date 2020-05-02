DROP TABLE IF EXISTS pricingstrategy;

CREATE TABLE pricingstrategy (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  strategykey VARCHAR(250) NOT NULL,
  strategyvalue VARCHAR(250) NOT NULL
);

DROP TABLE IF EXISTS course;

CREATE TABLE course (
    id INT AUTO_INCREMENT  PRIMARY KEY,
    coursename VARCHAR(250) NOT NULL,
    pricingstrategy VARCHAR(250) DEFAULT 'FREE'
);

DROP TABLE IF EXISTS user;

CREATE TABLE user (
    id INT AUTO_INCREMENT  PRIMARY KEY,
    firstname VARCHAR(250) NOT NULL,
    lastname VARCHAR(250) NOT NULL,
    email VARCHAR(250) DEFAULT NULL,
    location VARCHAR(250) NOT NULL
);

DROP TABLE IF EXISTS usercourse;

CREATE TABLE usercourse (
   id INT AUTO_INCREMENT  PRIMARY KEY,
   courseid INT NOT NULL,
   userid INT NOT NULL,
   foreign key (courseid) references course(id),
   foreign key (userid) references user(id)
);

DROP TABLE IF EXISTS pricingdetail;

CREATE TABLE pricingdetail (
     id INT AUTO_INCREMENT  PRIMARY KEY,
     courseid INT NOT NULL,
     baseprice INT NOT NULL,
     taxes INT DEFAULT 0,
     other INT DEFAULT 0,
     location VARCHAR(250) NOT NULL,
     foreign key (courseid) references course(id)
);
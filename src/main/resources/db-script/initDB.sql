create database lbd;

create TABLE lbd.business_category (
    id int NOT NULL AUTO_INCREMENT,
    category varchar(255),
    createdOn timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updatedOn timestamp NULL DEFAULT CURRENT_TIMESTAMP ON update CURRENT_TIMESTAMP,
    PRIMARY KEY ( id )
);

create TABLE lbd.user (
    id int NOT NULL AUTO_INCREMENT,
    username varchar(255),
    password varchar(500),
    forename varchar(255),
    surname varchar(255),
    role varchar(255),
    createdOn timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updatedOn timestamp NULL DEFAULT CURRENT_TIMESTAMP ON update CURRENT_TIMESTAMP,
    PRIMARY KEY ( id )
);
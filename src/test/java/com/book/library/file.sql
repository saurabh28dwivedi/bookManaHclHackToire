create table BookBorrowHistory (
        Id bigint not null auto_increment,
        bookId varchar(45) not null,
        UserId varchar(20) not null,
        Issue_date varchar(20) not null,
        return_date varchar(64) not null,
        TotalFine varchar(64) not null,
        primary key (id)
    ) engine=InnoDB
 

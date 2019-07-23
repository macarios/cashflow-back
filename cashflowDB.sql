create table event
(
    id          int auto_increment
        primary key,
    date        date                    null,
    kind        varchar(3) default 'in' not null,
    description varchar(50)             not null,
    reference   varchar(50)             null,
    value       decimal                 not null,
    notes       text                    null
);



create table if not exists public."person"(
    id             serial
        constraint "Person_pk"
            primary key,
    name           varchar(50) not null,
    first_surname  varchar(50) not null,
    second_surname varchar(50),
    phone          varchar(15),
    mobile         varchar(15) not null,
    email          varchar     not null
);

alter table public."person" owner to msc;
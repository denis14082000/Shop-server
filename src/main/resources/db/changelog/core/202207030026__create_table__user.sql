CREATE TABLE users (
    id          UUID NOT NULL PRIMARY KEY,
    name        TEXT NOT NULL,
    login       TEXT NOT NULL UNIQUE,
    password    TEXT NOT NULL
);
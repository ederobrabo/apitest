CREATE TABLE users (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    firstName TEXT NOT NULL,
    lastName TEXT NOT NULL,
    login TEXT NOT NULL,
    password TEXT NOT NULL
);
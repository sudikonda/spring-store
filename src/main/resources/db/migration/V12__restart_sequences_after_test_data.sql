-- Restart identity sequences so the next generated IDs don't conflict with
-- the explicit IDs inserted in V11 (H2 does not advance the sequence on manual INSERT).
ALTER TABLE users ALTER COLUMN id RESTART WITH 6;
ALTER TABLE addresses ALTER COLUMN id RESTART WITH 7;
ALTER TABLE profiles ALTER COLUMN id RESTART WITH 6;
ALTER TABLE categories ALTER COLUMN id RESTART WITH 7;
ALTER TABLE products ALTER COLUMN id RESTART WITH 17;
ALTER TABLE tags ALTER COLUMN id RESTART WITH 7;

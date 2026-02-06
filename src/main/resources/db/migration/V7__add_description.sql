ALTER TABLE products
    ADD COLUMN description TEXT NULL;

ALTER TABLE products
    ALTER COLUMN description SET NOT NULL;
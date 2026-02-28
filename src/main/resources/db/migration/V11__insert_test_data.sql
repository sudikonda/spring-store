-- Insert test data for all tables

-- Insert test users
INSERT INTO users (id, name, email, password) VALUES
(1, 'John Doe', 'john.doe@example.com', '$2a$10$N.zmdr9k7uOCQb376NoUnuTJ8iAt6Z5EHsM8lE9lBOsl7iKTVEFDa'),
(2, 'Jane Smith', 'jane.smith@example.com', '$2a$10$N.zmdr9k7uOCQb376NoUnuTJ8iAt6Z5EHsM8lE9lBOsl7iKTVEFDa'),
(3, 'Bob Johnson', 'bob.johnson@example.com', '$2a$10$N.zmdr9k7uOCQb376NoUnuTJ8iAt6Z5EHsM8lE9lBOsl7iKTVEFDa'),
(4, 'Alice Brown', 'alice.brown@example.com', '$2a$10$N.zmdr9k7uOCQb376NoUnuTJ8iAt6Z5EHsM8lE9lBOsl7iKTVEFDa'),
(5, 'Charlie Wilson', 'charlie.wilson@example.com', '$2a$10$N.zmdr9k7uOCQb376NoUnuTJ8iAt6Z5EHsM8lE9lBOsl7iKTVEFDa');

-- Insert addresses for users
INSERT INTO addresses (id, street, city, zip, state, user_id) VALUES
(1, '123 Main St', 'New York', '10001', 'NY', 1),
(2, '456 Oak Ave', 'Los Angeles', '90001', 'CA', 1),
(3, '789 Pine Rd', 'Chicago', '60601', 'IL', 2),
(4, '321 Elm St', 'Houston', '77001', 'TX', 3),
(5, '654 Maple Dr', 'Phoenix', '85001', 'AZ', 4),
(6, '987 Cedar Ln', 'Philadelphia', '19101', 'PA', 5);

-- Insert profiles for users
INSERT INTO profiles (id, bio, phone_number, date_of_birth, loyalty_points) VALUES
(1, 'Software engineer passionate about technology and innovation', '555-0101', '1990-05-15', 150),
(2, 'Marketing specialist with a love for creative campaigns', '555-0102', '1988-08-22', 75),
(3, 'Product manager focused on user experience', '555-0103', '1992-03-10', 200),
(4, 'Data analyst who enjoys finding insights in numbers', '555-0104', '1995-11-28', 50),
(5, 'UX designer creating beautiful and functional interfaces', '555-0105', '1991-07-18', 125);

-- Insert categories
INSERT INTO categories (id, name) VALUES
(1, 'Electronics'),
(2, 'Clothing'),
(3, 'Books'),
(4, 'Home & Garden'),
(5, 'Sports & Outdoors'),
(6, 'Toys & Games');

-- Insert products
INSERT INTO products (id, name, description, price, category_id) VALUES
(1, 'Laptop Pro 15"', 'High-performance laptop with 15-inch display', 1299.99, 1),
(2, 'Wireless Mouse', 'Ergonomic wireless mouse with long battery life', 29.99, 1),
(3, 'Bluetooth Headphones', 'Noise-cancelling over-ear Bluetooth headphones', 89.99, 1),
(4, 'Cotton T-Shirt', 'Soft 100% cotton crew neck t-shirt', 19.99, 2),
(5, 'Denim Jeans', 'Classic fit denim jeans', 49.99, 2),
(6, 'Winter Jacket', 'Warm insulated winter coat', 129.99, 2),
(7, 'Programming Book', 'Comprehensive guide to software development', 39.99, 3),
(8, 'Fiction Novel', 'Bestselling fiction novel', 14.99, 3),
(9, 'Cookbook', 'Collection of easy home recipes', 24.99, 3),
(10, 'Garden Tools Set', 'Complete set of essential garden tools', 79.99, 4),
(11, 'Indoor Plant', 'Low-maintenance houseplant', 15.99, 4),
(12, 'Yoga Mat', 'Non-slip exercise mat for yoga and fitness', 25.99, 5),
(13, 'Running Shoes', 'Lightweight running shoes with cushioning', 89.99, 5),
(14, 'Tennis Racket', 'Professional-grade tennis racket', 119.99, 5),
(15, 'Board Game', 'Family-friendly strategy board game', 29.99, 6),
(16, 'Puzzle Set', '1000-piece jigsaw puzzle', 19.99, 6);

-- Insert tags
INSERT INTO tags (id, name) VALUES
(1, 'premium'),
(2, 'sale'),
(3, 'new'),
(4, 'popular'),
(5, 'eco-friendly'),
(6, 'limited-edition');

-- Insert user-tag relationships
INSERT INTO user_tags (user_id, tag_id) VALUES
(1, 1), (1, 4),  -- John likes premium and popular items
(2, 2), (2, 5),  -- Jane likes sale and eco-friendly items
(3, 1), (3, 6),  -- Bob likes premium and limited-edition items
(4, 3), (4, 5),  -- Alice likes new and eco-friendly items
(5, 2), (5, 4);  -- Charlie likes sale and popular items

-- Insert wishlist items
INSERT INTO wishlist (product_id, user_id) VALUES
(1, 1),   -- John wants Laptop Pro
(3, 1),   -- John wants Bluetooth Headphones
(14, 1),  -- John wants Tennis Racket
(4, 2),   -- Jane wants Cotton T-Shirt
(7, 2),   -- Jane wants Programming Book
(11, 2),  -- Jane wants Indoor Plant
(2, 3),   -- Bob wants Wireless Mouse
(13, 3),  -- Bob wants Running Shoes
(15, 3),  -- Bob wants Board Game
(5, 4),   -- Alice wants Denim Jeans
(8, 4),   -- Alice wants Fiction Novel
(12, 4),  -- Alice wants Yoga Mat
(6, 5),   -- Charlie wants Winter Jacket
(10, 5),  -- Charlie wants Garden Tools Set
(16, 5);  -- Charlie wants Puzzle Set

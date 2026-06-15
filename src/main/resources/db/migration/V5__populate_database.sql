INSERT INTO categories (id, name)
VALUES (1, 'Fruits'),
       (2, 'Vegetables'),
       (3, 'Dairy'),
       (4, 'Bakery'),
       (5, 'Meat'),
       (6, 'Beverages'),
       (7, 'Pantry'),
       (8, 'Frozen Foods');

INSERT INTO products (name, price, `description`, category_id)
VALUES ('Organic Bananas', 1.99,
        'Fresh organic bananas sold per bunch. Naturally sweet and perfect for breakfast, smoothies, or snacks.', 1),

       ('Gala Apples', 3.49, 'Crisp and sweet Gala apples, ideal for lunchboxes, desserts, or eating fresh.', 1),

       ('Fresh Broccoli', 2.29,
        'Fresh green broccoli crown, rich in vitamins and great for steaming, roasting, or stir-frying.', 2),

       ('Whole Milk 1L', 1.49,
        'Fresh whole milk with a creamy taste, suitable for drinking, cooking, baking, and coffee.', 3),

       ('Greek Yogurt 500g', 2.79,
        'Thick and creamy Greek yogurt, high in protein and perfect with fruit, honey, or granola.', 3),

       ('Sourdough Bread', 3.99, 'Freshly baked sourdough bread with a crisp crust and soft, flavorful inside.', 4),

       ('Chicken Breast Fillet 500g', 5.99,
        'Lean chicken breast fillets, ideal for grilling, pan-frying, salads, and meal prep.', 5),

       ('Orange Juice 1L', 2.49,
        'Refreshing orange juice made from concentrate, perfect for breakfast or as a cold drink.', 6),

       ('Basmati Rice 1kg', 3.29,
        'Long-grain basmati rice with a fragrant aroma, ideal for curries, bowls, and side dishes.', 7),

       ('Frozen Mixed Vegetables 750g', 2.99,
        'A convenient frozen mix of carrots, peas, corn, and green beans for quick meals.', 8);
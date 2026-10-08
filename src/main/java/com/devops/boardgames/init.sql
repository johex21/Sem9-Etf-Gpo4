CREATE DATABASE IF NOT EXISTS semocho;
USE semocho;

CREATE TABLE IF NOT EXISTS boardgames (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    category VARCHAR(50) NOT NULL,
    min_players INT NOT NULL,
    max_players INT NOT NULL,
    price DECIMAL(10,2) NOT NULL,
    image_url VARCHAR(255)
);

INSERT INTO boardgames (name, category, min_players, max_players, price, image_url) VALUES 
('Catan', 'Estrategia', 3, 4, 34990.00, 'https://images.unsplash.com/photo-1610890716171-6b1bb98ffd09?w=500'),
('Carcassonne', 'Colocacion de Losetas', 2, 5, 29990.00, 'https://images.unsplash.com/photo-1606167668584-78701c57f13d?w=500'),
('Dixit', 'Creatividad / Familiar', 3, 6, 27990.00, 'https://images.unsplash.com/photo-1563941402622-4e7a488bcc57?w=500');
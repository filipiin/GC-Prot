CREATE TABLE item_inventory (
  id INT NOT NULL AUTO_INCREMENT  PRIMARY KEY,
  inventory_id INT NOT NULL,
  name VARCHAR(255) NOT NULL,
  description VARCHAR(255) NOT NULL,
  quantity INT NOT NULL,
  value FLOAT,
  situation VARCHAR(255) NOT NULL,
  created_at DATETIME,
  updated_at DATETIME,

  FOREIGN KEY (inventory_id) REFERENCES inventory (id) ON DELETE CASCADE
);
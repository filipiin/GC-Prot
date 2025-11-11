CREATE TABLE unit (
  id INT NOT NULL AUTO_INCREMENT  PRIMARY KEY,
  resident_id INT NOT NULL,
  num INT NOT NULL,
  street VARCHAR(255) NOT NULL,
  block VARCHAR(255) NOT NULL,
  situation VARCHAR(255) NOT NULL,
  created_at DATETIME,
  updated_at DATETIME,

  FOREIGN KEY (resident_id) REFERENCES resident (id) ON DELETE CASCADE
);
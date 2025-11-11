CREATE TABLE employee (
  id INT NOT NULL AUTO_INCREMENT  PRIMARY KEY,
  person_id INT NOT NULL,
  description VARCHAR(255) NOT NULL,
  wage FLOAT NOT NULL,
  function VARCHAR(255) NOT NULL,
  created_at DATETIME,
  updated_at DATETIME,

  FOREIGN KEY (person_id) REFERENCES person (id) ON DELETE CASCADE
);
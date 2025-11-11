CREATE TABLE dependent_resident (
  id INT NOT NULL AUTO_INCREMENT  PRIMARY KEY,
  person_id INT NOT NULL,
  resident_id INT NOT NULL,
  classification VARCHAR(255) NOT NULL,
  created_at DATETIME,
  updated_at DATETIME,

  FOREIGN KEY (resident_id) REFERENCES resident (id) ON DELETE CASCADE,
  FOREIGN KEY (person_id) REFERENCES person (id) ON DELETE CASCADE
);
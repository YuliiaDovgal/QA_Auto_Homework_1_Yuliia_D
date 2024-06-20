CREATE DATABASE VetClinic;
USE VetClinic;

CREATE TABLE Owners (
    OwnerID INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(100),
    Phone VARCHAR(15),
    Email VARCHAR(100)
);

CREATE TABLE Visits (
    VisitID INT AUTO_INCREMENT PRIMARY KEY,
    CatID INT,
    VisitDate DATE,
    Reason VARCHAR(255),
    FOREIGN KEY (CatID) REFERENCES Cats(CatID)
);

CREATE TABLE MedicalRecords (
    RecordID INT AUTO_INCREMENT PRIMARY KEY,
    VisitID INT,
    Diagnosis VARCHAR(255),
    Treatment VARCHAR(255),
    FOREIGN KEY (VisitID) REFERENCES Visits(VisitID)
);


CREATE TABLE Cats (
    CatID INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(100),
    Breed VARCHAR(50),
    Age INT,
    OwnerID INT,
    FOREIGN KEY (OwnerID) REFERENCES Owners(OwnerID)
);
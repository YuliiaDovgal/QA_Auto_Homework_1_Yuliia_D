
# Retrieve all cats with their owners
SELECT Cats.Name AS CatName, Cats.Breed, Owners.Name AS OwnerName, Owners.Phone
FROM Cats
JOIN Owners ON Cats.OwnerID = Owners.OwnerID;

# Retrieve all visits for a specific cat
SELECT Cats.Name AS CatName, Visits.VisitDate, Visits.Reason
FROM Visits
JOIN Cats ON Visits.CatID = Cats.CatID
WHERE Cats.Name = 'Whiskers';

# Retrieve medical records for a specific visit
SELECT Cats.Name AS CatName, Visits.VisitDate, MedicalRecords.Diagnosis, MedicalRecords.Treatment
FROM MedicalRecords
JOIN Visits ON MedicalRecords.VisitID = Visits.VisitID
JOIN Cats ON Visits.CatID = Cats.CatID
WHERE Visits.VisitID = 4;

#Retrieve all medical records for a specific cat
SELECT Cats.Name AS CatName, Visits.VisitDate, MedicalRecords.Diagnosis, MedicalRecords.Treatment
FROM MedicalRecords
JOIN Visits ON MedicalRecords.VisitID = Visits.VisitID
JOIN Cats ON Visits.CatID = Cats.CatID
WHERE Cats.Name = 'Whiskers';

SELECT Visits.VisitDate, Visits.Reason, MedicalRecords.Diagnosis, MedicalRecords.Treatment, 
Cats.Name, Cats.Breed, Owners.Name, Owners.Phone
FROM MedicalRecords
JOIN Visits ON MedicalRecords.VisitID = Visits.VisitID
JOIN Cats ON Visits.CatID = Cats.CatID
JOIN Owners ON Cats.OwnerID = Owners.OwnerID
WHERE (Visits.VisitDate) > '2024.03.01'
ORDER BY Visits.VisitID;

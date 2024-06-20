SELECT Visits.VisitDate, Visits.Reason, MedicalRecords.Diagnosis, MedicalRecords.Treatment, 
Cats.Name, Cats.Breed, Owners.Name, Owners.Phone
FROM MedicalRecords
JOIN Visits ON MedicalRecords.VisitID = Visits.VisitID
JOIN Cats ON Visits.CatID = Cats.CatID
JOIN Owners ON Cats.OwnerID = Owners.OwnerID
WHERE (Visits.VisitDate) > '2024.03.01'
ORDER BY Visits.VisitID;

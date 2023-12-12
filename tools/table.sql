CREATE TABLE salle(
    idSalle serial primary key,
    description VARCHAR(10)
);

CREATE TABLE etudiant(
    idEtudiant serial primary key not null,
    nomEtudiant VARCHAR(250),
    idSalle int,
    FOREIGN KEY (idSalle) REFERENCES salle (idSalle)
);

CREATE TABLE panneau(
    idPanneau serial primary key,

);

CREATE TABLE pointage(
    idPointage serial primary key
);
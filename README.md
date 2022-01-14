# proiect2

Nume: Andrada-Ioana Cojocaru
Serie: CA
Grupa: 322CA

CLASE DE BAZA:
 Am grupat clasele in pachetul entitati si astfel avem:
- Child clasa ce contine detalii despre fiecare copil:
id, nume, prenume, oras, varsta, cadourile preferate, scor de cumintenie,
istoricul notelor, bugetul asignat, cadourile primite, tipul de elf,
scorul de cumintenie al orasului
- Gift clasa ce contine informatii despre un cadou:
nume, pret, categorie, cantitate
- Santa clasa ce contine detalii despre numarul de ani in care se realizeaza
actiunea, bugetul, lista de cadouri, lista de copii, strategia
Am adaugat mai multe campuri pentru a-mi face implementarea mai facila.
Astfel in clasa Santa ne folosim de clasele Child si Gift


LOGICA PROGRAMULUI:
Pentru inceput trebuie sa citim JSON astfel am creat clasa InputLoader pentru
a crea acest lucru, dar si Utils unde am implementarile pentru preferintele de
cadou, lista de copii, lista de cadouri, schimbarile anuale
Initial strategia de sortare este dupa ID.

Ne folosim de clasa DataInput pentru  a calcula bugetul, avand in vedere si 
categoria de varsta, aplicand strategia corespunzatoare, dar si de tipul
de elf pe care fiecare copil il are (ale caror actiuni se gasesc in Black si
Pink in pachetul Elves)

Dupa ce am calculat bugetul asignat, este momentul sa punem cadourile in
functie de tipul lor (SetGifts) si sa le sortam in functie de pret (SortGifts).
Putem lua fiecare copil in parte sa ii alocam cadoul corespunzator (FindGifts)
Astfel, ii sortam in functie de strategia data, apoi pentru fiecare parcurgem
categoriile si incercam sa obtinem cel mai ieftin cadou, daca este pe stoc,
daca nu, trecem la urmatoarele
Pentru copilor ce nu a primit niciun fel de cadou si are elful YELLOW, incercam
sa ii alocam cel mai ieftin cadou din categoria preferata, daca exista

Rezultatele sunt copiate, pentru ca noile valori sa nu le afecteze pe cele
vechi(CopyResult)
Pentru a afisa rezultatul precum ni se cerea, am creat clasele noi ChildResult,
GiftResult si ListResult, unde vom pune fix campurile ce ne intereseaza

Intervin acum schimbarile anuale (trebuie sa incrementam varsta, sa updatam
bugetul, cadourile, copii, sa schimbam strategia data)

Algoritmul se aplica de nr de ani + 1 ori 


FOLOSIRE DESIGN PATTERNS:
*Builder - folosit pentru crearea claselor de baza precizate mai sus, dar si
pentru clasele auxiliare pentru rezultat
	 - stiu ca se foloseste in general pentru obiecte imutabile, insa am
considerat ca este util si in cazul de fata, deoarece avem obiecte destul de
complexe

*Singleton - folosit pentru a pastra o singura instanta
*Factory   - folosit pentru a obiecte care genereaza de clase inrudite 
*Strategy  - folosit pentru a avea o strategie cu mai multe implementari
posibile
Aceste design pattern-uri le-am folosit atat pentru implementarea alocarii
scorului in functie de categoria din care copii fac parte, cat si pentru
implementarea sortarii in functie de strategia data
In pachetul average se gasesc implementarile alocarii scorului:
Astfel, am creat o interfata GetAverageStrategy, apoi clase specifice
BabyGetAverageStrategy, KidGetAverageStrategy, TeenGetAverageStartegy,
YoungAdultGetAverageStrategy, toate implementeaza interfata si mostenesc metoda
getAverageScore
Mai apoi am creat clasa GetAerageStrategyFactory, ce creeaza o singura instanta
(Singleton), ce va avea tipul potrivit in functie de tipul de copil
Urmand aceeasi pasi am facut si implementarea solutiilor de sortare in functie
de strategia data.


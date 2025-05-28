public class Main {
    public static void main(String[] args) {
        Dao<SquadraNBA> dao = new SquadraDao();
        SquadraRepository repository = new SquadraRepositoryImpl(dao);

        SquadraNBA lakers = new SquadraNBA(1, "Lakers", "Los Angeles", 17);
        SquadraNBA celtics = new SquadraNBA(2, "Celtics", "Boston", 17);

        repository.registraSquadra(lakers);
        repository.registraSquadra(celtics);

        SquadraNBA trovata = repository.trovaSquadra(1);
        System.out.println(trovata);
    }
}

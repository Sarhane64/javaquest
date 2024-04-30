class Notice {
    public static void main(String[] args) {
        String[][] filmsActeurs = {
            {"Kingdom of the Crystal Skull", "Harrison Ford", "Cate Blanchett", "Shia LaBeouf"},
            {"The Last Crusade", "Harrison Ford", "Sean Connery", "Denholm Elliott"},
            {"The Temple of Doom", "Harrison Ford", "Kate Capshaw", "Jonathan Ke Quan"}
        };

        // Boucle pour afficher les films et leurs acteurs associés
        for (String[] filmActeurs : filmsActeurs) {
            String film = filmActeurs[0];
            String acteur1 = filmActeurs[1];
            String acteur2 = filmActeurs[2];
            String acteur3 = filmActeurs[3];
            System.out.println("Dans le film " + film + ", les principaux acteurs sont : " + acteur1 + ", " + acteur2 + ", " + acteur3);
        }
    }
}





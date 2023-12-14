public class MediaAlunosStr {
    public static void main(String[] args) {
        String[][] notas = {
            {"1234", "7.5", "8.2", "9.0"},
            {"5678", "5.0", "6.8", "7.2"},
            {"9012", "9.5", "8.0", "7.8"},
            {"3456", "4.5", "6.0", "5.5"},
            {"7890", "8.9", "9.3", "8.7"},
            {"1357", "6.2", "7.5", "6.8"},
            {"2468", "9.1", "8.5", "9.8"},
            {"8765", "3.5", "4.0", "3.8"},
            {"4321", "7.0", "7.5", "6.9"},
            {"9876", "8.2", "9.0", "8.5"},
            {"5432", "6.5", "7.2", "7.8"},
            {"1098", "5.0", "6.5", "6.0"},
            {"6543", "8.0", "8.5", "7.7"},
            {"2109", "4.2", "5.0", "4.8"},
            {"7531", "9.7", "9.8", "9.5"},
            {"4682", "7.8", "8.5", "8.0"},
            {"1359", "6.0", "7.0", "6.5"},
            {"2460", "5.5", "6.2", "5.8"},
            {"9871", "8.5", "9.0", "8.2"},
            {"6547", "7.0", "7.8", "7.5"},
            {"3210", "4.8", "5.5", "4.0"},
            {"7893", "9.3", "9.7", "9.8"},
            {"2461", "6.8", "7.2", "7.0"},
            {"7530", "7.5", "8.0", "8.5"},
            {"1095", "5.9", "6.5", "6.2"},
            {"8642", "8.2", "8.8", "8.5"},
            {"3219", "6.0", "7.0", "6.5"},
            {"5430", "9.0", "9.5", "8.7"},
            {"2103", "7.2", "7.8", "8.0"},
            {"9753", "5.5", "6.0", "5.8"},
            {"5312", "8.5", "9.0", "8.8"},
            {"2467", "6.7", "7.2", "7.5"}
        };

        double notasTurma = 0;
        double mediaTurma;

        for (int i = 0; i < notas.length; i++) {
            double notasAluno = 0;
            for (int j = 1; j <= 3; j++) {
                notasAluno += Double.parseDouble((notas[i][j]));
            }
            double mediaAluno = notasAluno / 3;
            notasTurma += mediaAluno;
        }

        mediaTurma = notasTurma / notas.length;

        System.out.printf("A média da turma é %.2f", mediaTurma);
    }
}
//Double.parse
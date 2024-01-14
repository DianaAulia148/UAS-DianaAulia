import java.util.*;
public class CovidData {

        private ArrayList<String> Namapasien;
        private ArrayList<Integer> Umur;
        private ArrayList<Boolean> Status_Vaksin;

        public CovidData() {
            Namapasien = new ArrayList<>();
            Umur = new ArrayList<>();
            Status_Vaksin = new ArrayList<>();
        }

        public void addPatient(String name, int age, boolean vaccinated) {
            Namapasien.add(name);
            Umur.add(age);
            Status_Vaksin.add(vaccinated);
        }

        public void calculateEstimatedYearOfBirth() {
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            ArrayList<Integer> estimatedYearOfBirth = new ArrayList<>();

            for (int age : Umur) {
                estimatedYearOfBirth.add(currentYear - age);
            }

            System.out.println("Estimated Year of Birth for each patient:");
            for (int year : estimatedYearOfBirth) {
                System.out.println(year);
            }
        }

        public static void main(String[] args) {
            CovidData covidData = new CovidData();

            for (int i = 0; i < 105; i++) {
                covidData.addPatient("Patient " + (i + 1), (int) (Math.random() * 100), false);
            }

            covidData.calculateEstimatedYearOfBirth();
        }
    }


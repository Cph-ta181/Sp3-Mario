//@Daniel

import java.util.List;
import java.util.Scanner;

    public class UIController {
        Scanner sc = new Scanner(System.in);

        public void runApp(){
            int run = 0;
            printMenuKort();
            while (run != 9) {

                run = sc.nextInt();
                switch (run) {
                    case 1:visPizza();break;
                    case 2:bestilPizza();break;
                    case 3:visAktiveBestillinger();break;
                    case 9:exit();break;
                    default: exit();
                }


            }



        }

        private void exit() {
        }

        private void visAktiveBestillinger() {
        }

        private void bestilPizza() {
        }

        private void visPizza() {
        }

        private void printMenuKort() {
        }


        @Override
        public List<Pizza> getPizza() {
            return null;
        }

        @Override
        public List<Bestilling> getAlleOrdrer() {
            return null;
        }

        @Override
        public Bestilling ordrerId(int id) {
            return null;
        }

        @Override
        public void GemOrdrer(Bestilling ordrer) {

        }

        @Override
        public void markerOrdrerSomFærdig(Bestilling ordrer) {


        }
    }

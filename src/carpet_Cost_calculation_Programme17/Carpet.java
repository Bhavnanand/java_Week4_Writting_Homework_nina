package carpet_Cost_calculation_Programme17;

public class Carpet {
    double cost;
        public Carpet(double cost) {
            if (cost < 0) {
                this.cost = 0;
            } else {
                this.cost = cost;
            }
        }

        public double getcost() {
            return this.cost;
        }
    }



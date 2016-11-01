/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriell
 */
public class Counter {

    private int value = 0;
    private boolean check = true;

    public Counter(int startingValue, boolean check) {
        this.check = check;
        this.value = startingValue;
        if (this.check == true) {
            if (this.value <= 0) {
                this.value = 0;
            } else {
                this.value = startingValue;
            }
        }
    }

    public Counter(int startingValue) {
        this.check = false;
        this.value = startingValue;
    }

    public Counter(boolean check) {
        this.check = check;
        this.value = 0;
    }

    public Counter() {
        this.check = false;
        this.value = 0;
    }

    public int value() {
        return this.value;
    }

    public void decrease() {
        if (this.check == true && this.value > 0) {
            this.value--;
        } else if (check == false) {
            this.value--;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount < 0) {

        } else {
            if (this.check == true && this.value > 0) {
                this.value -= decreaseAmount;
                if (this.value < 0) {
                    this.value = 0;
                }
            } else if (check == false) {
                this.value -= decreaseAmount;
            }   
        }

    }

    public void increase() {
        this.value++;
    }

    public void increase(int increaseAmount) {
        if (increaseAmount < 0) {
        } else {
            this.value += increaseAmount;
        }
    }

}

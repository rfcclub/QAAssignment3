package msd.conestoga.org.qalab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import msd.conestoga.org.qalab3.business.Calculator;

public class MainActivity extends AppCompatActivity {

    private final int ADD = 0, SUBTRACT = 1, MULTIPLY = 2, DIVIDE = 3, NOTHING = 4;
    Button btnAdd, btnSubtract, btnMultiply, btnDivide;
    TextView ribbon;
    double numberOne = Double.MIN_VALUE, numberTwo = Double.MIN_VALUE;
    boolean athrimeticButtonPressed = false;
    int function = NOTHING;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ribbon = findViewById(R.id.ribbon);
        findViewById(R.id.btnOne).setOnClickListener(v-> addNum(1));
        findViewById(R.id.btnTwo).setOnClickListener(v-> addNum(2));
        findViewById(R.id.btnThree).setOnClickListener(v-> addNum(3));
        findViewById(R.id.btnFour).setOnClickListener(v-> addNum(4));
        findViewById(R.id.btnFive).setOnClickListener(v-> addNum(5));
        findViewById(R.id.btnSix).setOnClickListener(v-> addNum(6));
        findViewById(R.id.btnSeven).setOnClickListener(v-> addNum(7));
        findViewById(R.id.btnEight).setOnClickListener(v-> addNum(8));
        findViewById(R.id.btnNine).setOnClickListener(v-> addNum(9));
        findViewById(R.id.btnZero).setOnClickListener(v-> addNum(0));

        findViewById(R.id.btnDecimal).setOnClickListener(v -> {
            if (!athrimeticButtonPressed) {
                String string = ribbon.getText().toString();
                if (string != null && string.indexOf(".") <0) {
                    ribbon.setText(ribbon.getText() + ".");
                }
            }
        });

        findViewById(R.id.btnAdd).setOnClickListener(v -> setFunction(ADD));
        findViewById(R.id.btnSubtract).setOnClickListener(v -> setFunction(SUBTRACT));
        findViewById(R.id.btnMultiply).setOnClickListener(v -> setFunction(MULTIPLY));
        findViewById(R.id.btnDivide).setOnClickListener(v -> setFunction(DIVIDE));

        findViewById(R.id.btnEqual).setOnClickListener( v-> {
            if (numberOne != Double.MIN_VALUE && function != NOTHING) {
                doCalculation();
            }
        });
        findViewById(R.id.btnClear).setOnClickListener( v-> {
            reset();
        });
        findViewById(R.id.btnNegative).setOnClickListener( v-> {
            String ribbonText = getValidRibbonText(ribbon.getText().toString());
            if (!ribbonText.equals("0")) {
                ribbon.setText("-" + ribbonText);
            }
        });
    }

    private void reset() {
        function = NOTHING;
        numberOne = Double.MIN_VALUE;
        numberTwo = Double.MIN_VALUE;
        ribbon.setText("0");
    }

    private void setFunction(int functionSet) {
        String ribbonString = getValidRibbonText(ribbon.getText().toString());
        boolean shouldCalculate = false;
        if (function == NOTHING) {
            function = functionSet;
            if (numberOne == Double.MIN_VALUE) {
                numberOne = Double.parseDouble(ribbonString);
            } else {
                shouldCalculate = true;
            }
        } else {
            Toast.makeText(this, "Function is set. Need to press = to have result",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        if (shouldCalculate) {
            doCalculation();
        }
        athrimeticButtonPressed = true;
    }

    private void doCalculation() {
        String ribbonString = getValidRibbonText(ribbon.getText().toString());
        // set number Two and do calculation
        numberTwo = Double.parseDouble(ribbonString);
        double result = 0.0;
        Calculator calculator = new Calculator();
        switch (function) {
            case ADD:
                result = calculator.addition(numberOne, numberTwo);
                break;
            case SUBTRACT:
                result = calculator.subtraction(numberOne, numberTwo);
                break;
            case MULTIPLY:
                result = calculator.multiplication(numberOne, numberTwo);
                break;
            case DIVIDE:
                if (numberTwo == 0) {
                    Toast.makeText(this, "Divided by zero", Toast.LENGTH_SHORT).show();
                    reset();
                } else {
                    result = calculator.division(numberOne, numberTwo);
                }
                break;
            default:
                break;
        }
        ribbon.setText(String.valueOf(result));
        function = NOTHING;
        numberOne = Double.MIN_VALUE;
        numberTwo = Double.MIN_VALUE;
        athrimeticButtonPressed = true;
    }

    private String getValidRibbonText(String s) {
        if (s == null || s.length() == 0) return "0";
        String res = s;
        if (res.endsWith(".")) res = res.substring(0, res.length() - 1);
        return res;
    }

    private void addNum(int num) {
        String text = ribbon.getText().toString();
        if (athrimeticButtonPressed) {
            ribbon.setText(String.valueOf(num));
            athrimeticButtonPressed = false;
        } else {
            if (text == null) {
                ribbon.setText(String.valueOf(num));
            } else if (text.length() > 1 || !text.equals("0")) {
                ribbon.setText(text + String.valueOf(num));
            } else {
                ribbon.setText(String.valueOf(num));
            }
        }
    }
}

package Lesson6;

//Разработать оконное приложение «Калькулятор»;
//1.1. Калькулятор должен выполнять 4 простейшие арифметические операции.
//1.2. Калькулятор должен иметь одно окно вывода результатов.
//1.3. Калькулятор работает с двумя параметрами, вводимыми пользователем в окна ввода.

//* Научить калькулятор операции возведения в степень.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator extends JFrame {
    public static void main(String[] args) {
        new Calculator();
    }
    int firstValue = 0;
    String operation = "+";
    Calculator() {
        setBounds(300,300,300,300);
        setLayout(new BorderLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea display= new JTextArea();//дисплей
        JPanel Panel = new JPanel(new GridLayout(3,5));//панель с кнопками
        JButton button0 = new JButton("0");//кнопка 0
        JButton button1 = new JButton("1");//кнопка 1
        JButton button2 = new JButton("2");//кнопка 2
        JButton button3 = new JButton("3");//кнопка 3
        JButton button4 = new JButton("4");//кнопка 4
        JButton button5 = new JButton("5");//кнопка 5
        JButton button6 = new JButton("6");//кнопка 6
        JButton button7 = new JButton("7");//кнопка 7
        JButton button8 = new JButton("8");//кнопка 8
        JButton button9 = new JButton("9");//кнопка 9
        JButton buttonPlus = new JButton("+");//кнопка +
        JButton buttonClean = new JButton("C");//кнопка С
        JButton buttonDivision = new JButton("/");//кнопка /
        JButton buttonMinus = new JButton("-");//кнопка -
        JButton buttonMul = new JButton("*");//кнопка *
        JButton buttonStart = new JButton("=");//кнопка =
        JButton buttonPower = new JButton("^");//кнопка ^
        add(display,BorderLayout.NORTH);
        add(Panel,BorderLayout.CENTER);
        add(buttonStart,BorderLayout.SOUTH);
        Panel.add(button0);
        Panel.add(button1);
        Panel.add(button2);
        Panel.add(button3);
        Panel.add(button4);
        Panel.add(button5);
        Panel.add(button6);
        Panel.add(button7);
        Panel.add(button8);
        Panel.add(button9);
        Panel.add(buttonPlus);
        Panel.add(buttonClean);
        Panel.add(buttonDivision);
        Panel.add(buttonMinus);
        Panel.add(buttonMul);
        Panel.add(buttonPower);

        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "0");
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"1");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"2");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"3");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"4");
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"5");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"6");
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"7");
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"8");
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"9");
            }
        });


        buttonClean.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = display.getText();
                display.setText(temp.substring(0,temp.length()-1));
            }
        });


        buttonPlus.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.valueOf(display.getText());
                display.setText("");

                operation = "+";
            }
        });

        buttonPower.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.valueOf(display.getText());
                display.setText("");
                operation = "^";
            }
        });
        buttonMul.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.valueOf(display.getText());
                display.setText("");
                operation = "*";
            }
        });
        buttonDivision.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.valueOf(display.getText());
                display.setText("");
                operation = "/";
            }
        });
        buttonMinus.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.valueOf(display.getText());
                display.setText("");
                operation = "-";
            }
        });

        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int secondValue = Integer.valueOf(display.getText());
                if("+".equals(operation)){
                    display.setText((firstValue+secondValue)+"");
                }
                if("-".equals(operation)){
                    display.setText((firstValue-secondValue)+"");
                }
                if("*".equals(operation)){
                    display.setText((firstValue*secondValue)+"");
                }
                if("/".equals(operation)){
                    display.setText((firstValue/secondValue)+"");
                }
                if("^".equals(operation)){
                    display.setText((Math. pow(firstValue, secondValue))+"");
                }
                firstValue = 0;
                operation = "+";
            }
        });
    }
}

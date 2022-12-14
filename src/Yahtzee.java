
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.*;


public class Yahtzee extends JFrame {

    public Yahtzee() {
        initComponents();
        diceIcons.add(new ImageIcon("dice1.png"));
        diceIcons.add(new ImageIcon("dice2.png"));
        diceIcons.add(new ImageIcon("dice3.png"));
        diceIcons.add(new ImageIcon("dice4.png"));
        diceIcons.add(new ImageIcon("dice5.png"));
        diceIcons.add(new ImageIcon("dice6.png"));

        buttonList.add(diceButton1);
        buttonList.add(diceButton2);
        buttonList.add(diceButton3);
        buttonList.add(diceButton4);
        buttonList.add(diceButton5);

        for(int i = 0; i < 5; i++)
        {
            selectedList.add(false);
        }

        ArrayList<AbstractButton> l = Collections.list(buttonGroup1.getElements());

        for(AbstractButton b : l)
        {
            b.setEnabled(false);
        }

        endTurnButton.setVisible(false);
        endRollingButton.setEnabled(false);
        gameOverLabel.setVisible(false);
        winnerLabel.setVisible(false);
    }

    private void initComponents() {

        buttonGroup1 = new ButtonGroup();
        diceInterface = new JPanel();
        diceButton1 = new JButton("-");
        diceButton2 = new JButton("-");
        diceButton3 = new JButton("-");
        diceButton4 = new JButton("-");
        diceButton5 = new JButton("-");
        rollButton = new JButton("Roll");
        endRollingButton = new JButton("Done");
        player1Scorecard = new JPanel();
        jLabel1 = new JLabel("Player 1");
        jLabel3 = new JLabel("Upper Section");
        jLabel4 = new JLabel("Aces");
        jLabel5 = new JLabel("Twos");
        jLabel6 = new JLabel("Threes");
        jLabel7 = new JLabel("Fours");
        jLabel8 = new JLabel("Fives");
        jLabel9 = new JLabel("Sixes");
        jLabel10 = new JLabel("Total Score:");
        jLabel11 = new JLabel("Bonus (63+):");
        jLabel12 = new JLabel("Upper Section Total:");
        acesButtonP1 = new JRadioButton();
        twosButtonP1 = new JRadioButton();
        threesButtonP1 = new JRadioButton();
        foursButtonP1 = new JRadioButton();
        fivesButtonP1 = new JRadioButton();
        sixesButtonP1 = new JRadioButton();
        twosPointsP1 = new JLabel("0");
        foursPointsP1 = new JLabel("0");
        threesPointsP1 = new JLabel("0");
        acesPointsP1 = new JLabel("0");
        fivesPointsP1 = new JLabel("0");
        sixesPointsP1 = new JLabel("0");
        totalP1 = new JLabel("0");
        upperSectionBonusP1 = new JLabel("0");
        upperSectionP1 = new JLabel("0");
        jLabel22 = new JLabel("Lower Section");
        jLabel23 = new JLabel("Three of a Kind:");
        jLabel24 = new JLabel("Four of a Kind:");
        jLabel25 = new JLabel("Full House:");
        jLabel26 = new JLabel("Small Straight:");
        jLabel27 = new JLabel("Large Straight:");
        jLabel28 = new JLabel("Yahtzee:");
        jLabel29 = new JLabel("Chance:");
        jLabel30 = new JLabel("Yahtzee Bonus:");
        threeOfAKindButtonP1 = new JRadioButton();
        fourOfAKindButtonP1 = new JRadioButton();
        fullHouseButtonP1 = new JRadioButton();
        smallStraightButtonP1 = new JRadioButton();
        largeStraightButtonP1 = new JRadioButton();
        yahtzeeButtonP1 = new JRadioButton();
        chanceButtonP1 = new JRadioButton();
        jLabel31 = new JLabel("Upper Section Total:");
        jLabel32 = new JLabel("Lower Section Total:");
        jLabel33 = new JLabel("Grand Total:");
        threeOfAKindPointsP1 = new JLabel("0");
        fourOfAKindPointsP1 = new JLabel("0");
        fullHousePointsP1 = new JLabel("0");
        smallStraightPointsP1 = new JLabel("0");
        largeStraightPointsP1 = new JLabel("0");
        yahtzeePointsP1 = new JLabel("0");
        chancePointsP1 = new JLabel("0");
        yahtzeeBonusP1 = new JLabel("0");
        secondUpperSectionTotalP1 = new JLabel("0");
        lowerSectionPointsP1 = new JLabel("0");
        grandTotalP1 = new JLabel("0");
        gameStatePanel = new JPanel();
        turnLabel = new JLabel("It is " + turn + "'s Turn");
        rollsLeftLabel = new JLabel("Rolls left: " + Integer.toString(rollsLeft));
        diceSelectedLabel = new JLabel("Dice selected: ");
        choiceYield = new JLabel("Choice Yield: ");
        yieldLabel = new JLabel("-");
        endTurnButton = new JButton("End Turn");
        gameOverLabel = new JLabel("Game Over");
        winnerLabel = new JLabel("jLabel2");
        player2Scorecard = new JPanel();
        jLabel34 = new JLabel("Player 2");
        jLabel35 = new JLabel("Upper Section");
        jLabel36 = new JLabel("Aces");
        jLabel37 = new JLabel("Twos");
        jLabel38 = new JLabel("Threes");
        jLabel39 = new JLabel("Fours");
        jLabel40 = new JLabel("Fives");
        jLabel41 = new JLabel("Sixes");
        jLabel42 = new JLabel("Total Score");
        jLabel43 = new JLabel("Bonus (63+):");
        jLabel44 = new JLabel("Upper Section Total:");
        acesButtonP2 = new JRadioButton();
        twosButtonP2 = new JRadioButton();
        threesButtonP2 = new JRadioButton();
        foursButtonP2 = new JRadioButton();
        fivesButtonP2 = new JRadioButton();
        sixesButtonP2 = new JRadioButton();
        twosPointsP2 = new JLabel("0");
        foursPointsP2 = new JLabel("0");
        threesPointsP2 = new JLabel("0");
        acesPointsP2 = new JLabel("0");
        fivesPointsP2 = new JLabel("0");
        sixesPointsP2 = new JLabel("0");
        totalP2 = new JLabel("0");
        upperSectionBonusP2 = new JLabel("0");
        upperSectionP2 = new JLabel("0");
        jLabel54 = new JLabel("Lower Section");
        jLabel55 = new JLabel("Three of a Kind:");
        jLabel56 = new JLabel("Four of a Kind:");
        jLabel57 = new JLabel("Full House:");
        jLabel58 = new JLabel("Small Straight:");
        jLabel59 = new JLabel("Large Straight:");
        jLabel60 = new JLabel("Yahtzee:");
        jLabel61 = new JLabel("Chance: ");
        jLabel62 = new JLabel("Yahtzee Bonus:");
        threeOfAKindButtonP2 = new JRadioButton();
        fourOfAKindButtonP2 = new JRadioButton();
        fullHouseButtonP2 = new JRadioButton();
        smallStraightButtonP2 = new JRadioButton();
        largeStraightButtonP2 = new JRadioButton();
        yahtzeeButtonP2 = new JRadioButton();
        chanceButtonP2 = new JRadioButton();
        jLabel63 = new JLabel();
        jLabel64 = new JLabel();
        jLabel65 = new JLabel();
        threeOfAKindPointsP2 = new JLabel("0");
        fourOfAKindPointsP2 = new JLabel("0");
        fullHousePointsP2 = new JLabel("0");
        smallStraightPointsP2 = new JLabel("0");
        largeStraightPointsP2 = new JLabel("0");
        yahtzeePointsP2 = new JLabel("0");
        chancePointsP2 = new JLabel("0");
        yahtzeeBonusP2 = new JLabel("0");
        secondUpperSectionTotalP2 = new JLabel("0");
        lowerSectionPointsP2 = new JLabel("0");
        grandTotalP2 = new JLabel("0");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Yahtzee");
        setPreferredSize(new Dimension(600, 600));

        diceInterface.setBorder(BorderFactory.createLineBorder(Color.black));

        diceButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                diceButton1ActionPerformed(evt);
            }
        });

        diceButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                diceButton2ActionPerformed(evt);
            }
        });

        diceButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                diceButton3ActionPerformed(evt);
            }
        });

        diceButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                diceButton4ActionPerformed(evt);
            }
        });

        diceButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                diceButton5ActionPerformed(evt);
            }
        });

        rollButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                rollButtonActionPerformed(evt);
            }
        });

        endRollingButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                endRollingButtonActionPerformed(evt);
            }
        });

        GroupLayout diceInterfaceLayout = new GroupLayout(diceInterface);
        diceInterface.setLayout(diceInterfaceLayout);
        diceInterfaceLayout.setHorizontalGroup(
                diceInterfaceLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(diceInterfaceLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(diceInterfaceLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(diceInterfaceLayout.createSequentialGroup()
                                                .addComponent(diceButton4, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(diceButton5, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(diceInterfaceLayout.createSequentialGroup()
                                                .addComponent(diceButton1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(diceButton2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(diceInterfaceLayout.createSequentialGroup()
                                                .addComponent(rollButton)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(endRollingButton)
                                                .addGap(0, 6, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(GroupLayout.Alignment.TRAILING, diceInterfaceLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(diceButton3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
        );
        diceInterfaceLayout.setVerticalGroup(
                diceInterfaceLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(diceInterfaceLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(diceInterfaceLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(diceButton2, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                        .addComponent(diceButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(diceButton3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(diceInterfaceLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(diceButton4, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                        .addComponent(diceButton5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(diceInterfaceLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(rollButton)
                                        .addComponent(endRollingButton))
                                .addContainerGap(22, Short.MAX_VALUE))
        );

        player1Scorecard.setBorder(BorderFactory.createLineBorder(Color.black));

        jLabel1.setFont(new Font("Segoe UI", 1, 12));

        buttonGroup1.add(acesButtonP1);
        acesButtonP1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                acesButtonP1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(twosButtonP1);
        twosButtonP1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                twosButtonP1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(threesButtonP1);
        threesButtonP1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                threesButtonP1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(foursButtonP1);
        foursButtonP1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                foursButtonP1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(fivesButtonP1);
        fivesButtonP1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                fivesButtonP1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(sixesButtonP1);
        sixesButtonP1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                sixesButtonP1ActionPerformed(evt);
            }
        });


        buttonGroup1.add(threeOfAKindButtonP1);
        threeOfAKindButtonP1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                threeOfAKindButtonP1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(fourOfAKindButtonP1);
        fourOfAKindButtonP1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                fourOfAKindButtonP1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(fullHouseButtonP1);
        fullHouseButtonP1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                fullHouseButtonP1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(smallStraightButtonP1);
        smallStraightButtonP1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                smallStraightButtonP1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(largeStraightButtonP1);
        largeStraightButtonP1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                largeStraightButtonP1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(yahtzeeButtonP1);
        yahtzeeButtonP1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                yahtzeeButtonP1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(chanceButtonP1);
        chanceButtonP1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                chanceButtonP1ActionPerformed(evt);
            }
        });

        GroupLayout player1ScorecardLayout = new GroupLayout(player1Scorecard);
        player1Scorecard.setLayout(player1ScorecardLayout);
        player1ScorecardLayout.setHorizontalGroup(
                player1ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(player1ScorecardLayout.createSequentialGroup()
                                .addGroup(player1ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                .addGroup(player1ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel10))
                                                        .addGroup(player1ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(jLabel4)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(acesButtonP1))
                                                                .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(jLabel5)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(twosButtonP1))
                                                                .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(jLabel6)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                                                        .addComponent(threesButtonP1))
                                                                .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(jLabel7)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(foursButtonP1))
                                                                .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(jLabel8)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(fivesButtonP1))
                                                                .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(jLabel9)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(sixesButtonP1))
                                                                .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                        .addGap(52, 52, 52)
                                                                        .addComponent(jLabel3))
                                                                .addGroup(GroupLayout.Alignment.TRAILING, player1ScorecardLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(jLabel1)
                                                                        .addGap(26, 26, 26))))
                                                .addGap(18, 18, 18)
                                                .addGroup(player1ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(twosPointsP1)
                                                        .addComponent(foursPointsP1)
                                                        .addComponent(threesPointsP1)
                                                        .addComponent(acesPointsP1)
                                                        .addComponent(fivesPointsP1)
                                                        .addComponent(sixesPointsP1)
                                                        .addComponent(totalP1)))
                                        .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(player1ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel30)
                                                        .addGroup(player1ScorecardLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                        .addComponent(jLabel29)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(chanceButtonP1))
                                                                .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                        .addComponent(jLabel28)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(yahtzeeButtonP1))
                                                                .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                        .addComponent(jLabel27)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(largeStraightButtonP1))
                                                                .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                        .addComponent(jLabel26)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(smallStraightButtonP1))
                                                                .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                        .addComponent(jLabel25)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(fullHouseButtonP1))
                                                                .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                        .addComponent(jLabel24)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(fourOfAKindButtonP1))
                                                                .addGroup(GroupLayout.Alignment.LEADING, player1ScorecardLayout.createSequentialGroup()
                                                                        .addComponent(jLabel23)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                                                        .addComponent(threeOfAKindButtonP1)))
                                                        .addComponent(jLabel11)
                                                        .addComponent(jLabel12)
                                                        .addComponent(jLabel31)
                                                        .addComponent(jLabel32)
                                                        .addComponent(jLabel33))
                                                .addGap(18, 18, 18)
                                                .addGroup(player1ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(grandTotalP1)
                                                        .addComponent(lowerSectionPointsP1)
                                                        .addComponent(secondUpperSectionTotalP1)
                                                        .addComponent(upperSectionBonusP1)
                                                        .addComponent(upperSectionP1)
                                                        .addComponent(threeOfAKindPointsP1)
                                                        .addComponent(fourOfAKindPointsP1)
                                                        .addComponent(fullHousePointsP1)
                                                        .addComponent(smallStraightPointsP1)
                                                        .addComponent(largeStraightPointsP1)
                                                        .addComponent(yahtzeePointsP1)
                                                        .addComponent(chancePointsP1)
                                                        .addComponent(yahtzeeBonusP1))))
                                .addContainerGap(16, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, player1ScorecardLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel22)
                                .addGap(50, 50, 50))
        );
        player1ScorecardLayout.setVerticalGroup(
                player1ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(player1ScorecardLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player1ScorecardLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(player1ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                .addGroup(player1ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(acesButtonP1)
                                                                        .addComponent(jLabel4))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(player1ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(twosPointsP1)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(twosButtonP1))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(player1ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(threesButtonP1)
                                                                        .addComponent(threesPointsP1)))
                                                        .addComponent(acesPointsP1))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(player1ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7)
                                                        .addComponent(foursButtonP1)
                                                        .addComponent(foursPointsP1))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(player1ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel8)
                                                        .addComponent(fivesButtonP1)
                                                        .addComponent(fivesPointsP1))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(player1ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel9)
                                                        .addComponent(sixesButtonP1)
                                                        .addComponent(sixesPointsP1))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(player1ScorecardLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(totalP1)
                                                        .addComponent(jLabel10))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(player1ScorecardLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(upperSectionBonusP1)
                                                        .addComponent(jLabel11))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(player1ScorecardLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(upperSectionP1)
                                                        .addComponent(jLabel12))
                                                .addGap(15, 15, 15)
                                                .addComponent(jLabel22)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(player1ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel23)
                                                        .addComponent(threeOfAKindButtonP1)
                                                        .addComponent(threeOfAKindPointsP1))
                                                .addGroup(player1ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel24))
                                                        .addGroup(player1ScorecardLayout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(fourOfAKindPointsP1))))
                                        .addComponent(fourOfAKindButtonP1))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player1ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel25)
                                        .addComponent(fullHouseButtonP1)
                                        .addComponent(fullHousePointsP1))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player1ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel26)
                                        .addComponent(smallStraightButtonP1)
                                        .addComponent(smallStraightPointsP1))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player1ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel27)
                                        .addComponent(largeStraightButtonP1)
                                        .addComponent(largeStraightPointsP1))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player1ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel28)
                                        .addComponent(yahtzeeButtonP1)
                                        .addComponent(yahtzeePointsP1))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player1ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel29)
                                        .addComponent(chanceButtonP1)
                                        .addComponent(chancePointsP1))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player1ScorecardLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel30)
                                        .addComponent(yahtzeeBonusP1))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player1ScorecardLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel31)
                                        .addComponent(secondUpperSectionTotalP1))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player1ScorecardLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel32)
                                        .addComponent(lowerSectionPointsP1))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player1ScorecardLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel33)
                                        .addComponent(grandTotalP1))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gameStatePanel.setBorder(BorderFactory.createLineBorder(Color.black));

        endTurnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                endTurnButtonActionPerformed(evt);
            }
        });
        GroupLayout gameStatePanelLayout = new GroupLayout(gameStatePanel);
        gameStatePanel.setLayout(gameStatePanelLayout);
        gameStatePanelLayout.setHorizontalGroup(
                gameStatePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gameStatePanelLayout.createSequentialGroup()
                                .addGroup(gameStatePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(gameStatePanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(gameStatePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(turnLabel)
                                                        .addComponent(rollsLeftLabel)
                                                        .addComponent(diceSelectedLabel)
                                                        .addGroup(gameStatePanelLayout.createSequentialGroup()
                                                                .addComponent(choiceYield)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(yieldLabel))))
                                        .addGroup(gameStatePanelLayout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addComponent(endTurnButton))
                                        .addGroup(gameStatePanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(gameOverLabel))
                                        .addGroup(gameStatePanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(winnerLabel)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gameStatePanelLayout.setVerticalGroup(
                gameStatePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gameStatePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(turnLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rollsLeftLabel)
                                .addGap(64, 64, 64)
                                .addComponent(diceSelectedLabel)
                                .addGap(18, 18, 18)
                                .addGroup(gameStatePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(choiceYield)
                                        .addComponent(yieldLabel))
                                .addGap(38, 38, 38)
                                .addComponent(endTurnButton)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(gameOverLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(winnerLabel)
                                .addGap(14, 14, 14))
        );

        player2Scorecard.setBorder(BorderFactory.createLineBorder(Color.black));
        jLabel34.setFont(new Font("Segoe UI", 1, 12)); // NOI18N

        buttonGroup1.add(acesButtonP2);
        acesButtonP2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                acesButtonP2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(twosButtonP2);
        twosButtonP2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                twosButtonP2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(threesButtonP2);
        threesButtonP2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                threesButtonP2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(foursButtonP2);
        foursButtonP2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                foursButtonP2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(fivesButtonP2);
        fivesButtonP2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                fivesButtonP2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(sixesButtonP2);
        sixesButtonP2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                sixesButtonP2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(threeOfAKindButtonP2);
        threeOfAKindButtonP2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                threeOfAKindButtonP2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(fourOfAKindButtonP2);
        fourOfAKindButtonP2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                fourOfAKindButtonP2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(fullHouseButtonP2);
        fullHouseButtonP2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                fullHouseButtonP2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(smallStraightButtonP2);
        smallStraightButtonP2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                smallStraightButtonP2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(largeStraightButtonP2);
        largeStraightButtonP2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                largeStraightButtonP2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(yahtzeeButtonP2);
        yahtzeeButtonP2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                yahtzeeButtonP2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(chanceButtonP2);
        chanceButtonP2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                chanceButtonP2ActionPerformed(evt);
            }
        });

        jLabel63.setText("Upper Section Total:");

        jLabel64.setText("Lower Section Total:");

        jLabel65.setText("Grand Total:");

        GroupLayout player2ScorecardLayout = new GroupLayout(player2Scorecard);
        player2Scorecard.setLayout(player2ScorecardLayout);
        player2ScorecardLayout.setHorizontalGroup(
                player2ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(player2ScorecardLayout.createSequentialGroup()
                                .addGroup(player2ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                .addGroup(player2ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel42))
                                                        .addGroup(player2ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(jLabel36)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(acesButtonP2))
                                                                .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(jLabel37)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(twosButtonP2))
                                                                .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(jLabel38)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                                                        .addComponent(threesButtonP2))
                                                                .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(jLabel39)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(foursButtonP2))
                                                                .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(jLabel40)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(fivesButtonP2))
                                                                .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(jLabel41)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(sixesButtonP2))
                                                                .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                                        .addGap(52, 52, 52)
                                                                        .addComponent(jLabel35))
                                                                .addGroup(GroupLayout.Alignment.TRAILING, player2ScorecardLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(jLabel34)
                                                                        .addGap(26, 26, 26))))
                                                .addGap(18, 18, 18)
                                                .addGroup(player2ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(twosPointsP2)
                                                        .addComponent(foursPointsP2)
                                                        .addComponent(threesPointsP2)
                                                        .addComponent(acesPointsP2)
                                                        .addComponent(fivesPointsP2)
                                                        .addComponent(sixesPointsP2)
                                                        .addComponent(totalP2)))
                                        .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(player2ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel62)
                                                        .addGroup(player2ScorecardLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                                        .addComponent(jLabel61)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(chanceButtonP2))
                                                                .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                                        .addComponent(jLabel60)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(yahtzeeButtonP2))
                                                                .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                                        .addComponent(jLabel59)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(largeStraightButtonP2))
                                                                .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                                        .addComponent(jLabel58)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(smallStraightButtonP2))
                                                                .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                                        .addComponent(jLabel57)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(fullHouseButtonP2))
                                                                .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                                        .addComponent(jLabel56)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(fourOfAKindButtonP2))
                                                                .addGroup(GroupLayout.Alignment.LEADING, player2ScorecardLayout.createSequentialGroup()
                                                                        .addComponent(jLabel55)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                                                        .addComponent(threeOfAKindButtonP2)))
                                                        .addComponent(jLabel43)
                                                        .addComponent(jLabel44)
                                                        .addComponent(jLabel63)
                                                        .addComponent(jLabel64)
                                                        .addComponent(jLabel65))
                                                .addGap(18, 18, 18)
                                                .addGroup(player2ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(grandTotalP2)
                                                        .addComponent(lowerSectionPointsP2)
                                                        .addComponent(secondUpperSectionTotalP2)
                                                        .addComponent(upperSectionBonusP2)
                                                        .addComponent(upperSectionP2)
                                                        .addComponent(threeOfAKindPointsP2)
                                                        .addComponent(fourOfAKindPointsP2)
                                                        .addComponent(fullHousePointsP2)
                                                        .addComponent(smallStraightPointsP2)
                                                        .addComponent(largeStraightPointsP2)
                                                        .addComponent(yahtzeePointsP2)
                                                        .addComponent(chancePointsP2)
                                                        .addComponent(yahtzeeBonusP2))))
                                .addContainerGap(14, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, player2ScorecardLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel54)
                                .addGap(50, 50, 50))
        );
        player2ScorecardLayout.setVerticalGroup(
                player2ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(player2ScorecardLayout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player2ScorecardLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                .addComponent(jLabel35)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(player2ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                                .addGroup(player2ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(acesButtonP2)
                                                                        .addComponent(jLabel36))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(player2ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(twosPointsP2)
                                                                        .addComponent(jLabel37)
                                                                        .addComponent(twosButtonP2))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(player2ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel38)
                                                                        .addComponent(threesButtonP2)
                                                                        .addComponent(threesPointsP2)))
                                                        .addComponent(acesPointsP2))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(player2ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel39)
                                                        .addComponent(foursButtonP2)
                                                        .addComponent(foursPointsP2))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(player2ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel40)
                                                        .addComponent(fivesButtonP2)
                                                        .addComponent(fivesPointsP2))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(player2ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel41)
                                                        .addComponent(sixesButtonP2)
                                                        .addComponent(sixesPointsP2))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(player2ScorecardLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(totalP2)
                                                        .addComponent(jLabel42))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(player2ScorecardLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(upperSectionBonusP2)
                                                        .addComponent(jLabel43))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(player2ScorecardLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(upperSectionP2)
                                                        .addComponent(jLabel44))
                                                .addGroup(player2ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(player2ScorecardLayout.createSequentialGroup()
                                                                .addGap(15, 15, 15)
                                                                .addComponent(jLabel54)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(player2ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel55)
                                                                        .addComponent(threeOfAKindButtonP2)
                                                                        .addComponent(threeOfAKindPointsP2))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel56))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, player2ScorecardLayout.createSequentialGroup()
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(fourOfAKindPointsP2))))
                                        .addComponent(fourOfAKindButtonP2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player2ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel57)
                                        .addComponent(fullHouseButtonP2)
                                        .addComponent(fullHousePointsP2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player2ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel58)
                                        .addComponent(smallStraightButtonP2)
                                        .addComponent(smallStraightPointsP2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player2ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel59)
                                        .addComponent(largeStraightButtonP2)
                                        .addComponent(largeStraightPointsP2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player2ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel60)
                                        .addComponent(yahtzeeButtonP2)
                                        .addComponent(yahtzeePointsP2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player2ScorecardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel61)
                                        .addComponent(chanceButtonP2)
                                        .addComponent(chancePointsP2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player2ScorecardLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel62)
                                        .addComponent(yahtzeeBonusP2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player2ScorecardLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel63)
                                        .addComponent(secondUpperSectionTotalP2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player2ScorecardLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel64)
                                        .addComponent(lowerSectionPointsP2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(player2ScorecardLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel65)
                                        .addComponent(grandTotalP2))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(diceInterface, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(gameStatePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(player1Scorecard, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(player2Scorecard, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(diceInterface, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(gameStatePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(player1Scorecard, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(player2Scorecard, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addContainerGap(31, Short.MAX_VALUE))))
        );

        pack();
    }


    public static String turn = "Player 1";
    public static int rollsLeft = 3;
    public static int ptsInQuestion = 0;
    public static ArrayList<ImageIcon> diceIcons = new ArrayList<ImageIcon>();
    public static ArrayList<JButton> buttonList = new ArrayList<JButton>();
    public static ArrayList<Boolean> selectedList = new ArrayList<Boolean>();
    public static boolean p1Has63 = false;
    public static boolean p2Has63 = false;
    public static int turnNum = 0;

    //only called on the first roll of the player's turn
    //reduces their turns by one and sets all the dice buttons' icons to random icons
    public void rollDice()
    {
        for(Boolean b : selectedList)
        {
            b = false;
        }
        rollsLeft--;
        for(JButton b : buttonList)
        {
            b.setIcon(diceIcons.get(((int) (6 * Math.random()) + 1) - 1));
        }
    }
    //called for the 2nd and 3rd rolls for each player
    //only rolls the unselected dice
    public void rollCertainDice()
    {
        rollsLeft--;
        for(int i = 0; i < 5; i++)
            if(!selectedList.get(i))
                buttonList.get(i).setIcon(diceIcons.get(((int) (6 * Math.random()) + 1) - 1));

        for(Boolean b : selectedList)
        {
            b = false;
        }
        for(JButton b : buttonList)
            b.setSelected(false);
        diceSelectedLabel.setText("Dice selected:");
    }
    //method to add selected dice to the list of selected dice
    public void handleDiceClick(int diceID)
    {
        if(!selectedList.get(diceID - 1))

        {
            selectedList.set(diceID - 1, true);
            String temp = diceSelectedLabel.getText();
            temp += Integer.toString(diceID) + ", ";
            diceSelectedLabel.setText(temp);
        } else
        {
            selectedList.set(diceID - 1, false);
            String temp = diceSelectedLabel.getText().replace(Integer.toString(diceID) + ", ", "");
            diceSelectedLabel.setText(temp);
        }
    }
    //returns an array containing the number of instances of each number in the final roll
    public int[] numberOfEach()
    {
        int[] result = {0, 0, 0, 0, 0, 0};

        for(JButton b : buttonList)
        {
            if(b.getIcon().equals(diceIcons.get(0)))
            {
                result[0]++;
            } else if(b.getIcon().equals(diceIcons.get(1)))
            {
                result[1]++;
            } else if (b.getIcon().equals(diceIcons.get(2)))
            {
                result[2]++;
            } else if(b.getIcon().equals(diceIcons.get(3)))
            {
                result[3]++;
            } else if(b.getIcon().equals(diceIcons.get(4)))
            {
                result[4]++;
            } else if (b.getIcon().equals(diceIcons.get(5)))
            {
                result[5]++;
            }
        }
        return result;
    }
    //returns the sum of all 5 dice
    public int sumOfAll()
    {
        int sum = 0;
        int[] nums = numberOfEach();
        for(int i = 0; i < 6; i++)
            sum += nums[i] * (i + 1);

        return sum;
    }
    //deals with all the changes to the frame that come with a player ending their turn
    public void applyPts(String player, JLabel l, boolean isUpper)
    {
        l.setText(Integer.toString(ptsInQuestion));
        if(player.equals("Player 1") && isUpper)
        {
            boolean flag = p1Has63;
            int total = Integer.parseInt(totalP1.getText()) + ptsInQuestion;
            totalP1.setText(Integer.toString(total));
            if(Integer.parseInt(totalP1.getText()) > 62)
            {
                p1Has63 = true;
            }

            if(p1Has63 && !flag)
            {
                upperSectionBonusP1.setText(Integer.toString(35));
                total += 35;
                ptsInQuestion += 35;
                int tot = Integer.parseInt(totalP1.getText());
                tot += Integer.parseInt(upperSectionBonusP1.getText());
                upperSectionP1.setText(Integer.toString(tot));
            } else
            {
                int tot = Integer.parseInt(totalP1.getText());
                tot += Integer.parseInt(upperSectionBonusP1.getText());
                upperSectionP1.setText(Integer.toString(tot));
            }

            secondUpperSectionTotalP1.setText(upperSectionP1.getText());
            int t2 = Integer.parseInt(upperSectionP1.getText());
            upperSectionP1.setText(Integer.toString(t2));

            int t3 = Integer.parseInt(grandTotalP1.getText());
            t3 += ptsInQuestion;
            grandTotalP1.setText(Integer.toString(t3));
            turn = "Player 2";
        } else if(turn.equals("Player 1") && !isUpper)
        {
            if(ptsInQuestion == 100)
            {
                int y = Integer.parseInt(yahtzeeBonusP1.getText());
                y += ptsInQuestion;
                yahtzeeBonusP1.setText(Integer.toString(y));
            }
            int current = Integer.parseInt(lowerSectionPointsP1.getText());
            current += ptsInQuestion;
            lowerSectionPointsP1.setText(Integer.toString(current));
            turn = "Player 2";
            int t3 = Integer.parseInt(grandTotalP1.getText());
            t3 += ptsInQuestion;
            grandTotalP1.setText(Integer.toString(t3));

        } else if(turn.equals("Player 2") && isUpper)
        {
            boolean flag = p2Has63;
            int total = Integer.parseInt(totalP2.getText()) + ptsInQuestion;
            totalP2.setText(Integer.toString(total));
            if(Integer.parseInt(totalP2.getText()) > 62)
            {
                p2Has63 = true;
            }

            if(p2Has63 && !flag)
            {
                upperSectionBonusP2.setText(Integer.toString(35));
                total += 35;
                ptsInQuestion += 35;
                int tot = Integer.parseInt(totalP2.getText());
                tot += Integer.parseInt(upperSectionBonusP2.getText());
                upperSectionP2.setText(Integer.toString(tot));
            } else
            {
                int tot = Integer.parseInt(totalP2.getText());
                tot += Integer.parseInt(upperSectionBonusP2.getText());
                upperSectionP2.setText(Integer.toString(tot));
            }

            secondUpperSectionTotalP2.setText(upperSectionP2.getText());
            int t2 = Integer.parseInt(upperSectionP2.getText());
            upperSectionP2.setText(Integer.toString(t2));

            int t3 = Integer.parseInt(grandTotalP2.getText());
            t3 += ptsInQuestion;
            grandTotalP2.setText(Integer.toString(t3));
            turn = "Player 1";
        } else
        {
            if(ptsInQuestion == 100)
            {
                int y = Integer.parseInt(yahtzeeBonusP2.getText());
                y += ptsInQuestion;
                yahtzeeBonusP2.setText(Integer.toString(y));
            }
            int current = Integer.parseInt(lowerSectionPointsP2.getText());
            current += ptsInQuestion;
            lowerSectionPointsP2.setText(Integer.toString(current));
            turn = "Player 1";
            int t3 = Integer.parseInt(grandTotalP2.getText());
            t3 += ptsInQuestion;
            grandTotalP2.setText(Integer.toString(t3));
        }
        rollButton.setEnabled(true);
        turnLabel.setText("It is " + turn + "'s Turn");
        for(JButton b : buttonList)
            b.setEnabled(true);
        rollsLeft = 3;
        rollsLeftLabel.setText("Rolls left: " + Integer.toString(rollsLeft));
    }


    private void diceButton1ActionPerformed(ActionEvent evt) {
        handleDiceClick(1);
    }

    private void rollButtonActionPerformed(ActionEvent evt) {
        switch (rollsLeft) {
            case 3 -> {
                rollDice();
                rollsLeftLabel.setText("Rolls left: " + Integer.toString(rollsLeft));
                endRollingButton.setEnabled(true);
            }
            case 2 -> {
                rollCertainDice();
                for(JButton b : buttonList)
                    b.setSelected(false);
                rollsLeftLabel.setText("Rolls left: " + Integer.toString(rollsLeft));
            }
            case 1 -> {
                rollButton.setEnabled(false);
                rollCertainDice();
                for(JButton b : buttonList)
                    b.setSelected(false);
                rollsLeftLabel.setText("Rolls left: " + Integer.toString(rollsLeft));
            }
            default -> {
            }

        }
        for(int i = 0; i < 5; i++)
        {
            selectedList.add(i, false);
        }
    }

    private void diceButton2ActionPerformed(ActionEvent evt) {
        handleDiceClick(2);
    }

    private void diceButton3ActionPerformed(ActionEvent evt) {
        handleDiceClick(3);
    }

    private void diceButton4ActionPerformed(ActionEvent evt) {
        handleDiceClick(4);
    }

    private void diceButton5ActionPerformed(ActionEvent evt) {
        handleDiceClick(5);
    }

    private void acesButtonP1ActionPerformed(ActionEvent evt) {
        endTurnButton.setVisible(true);
        yieldLabel.setText(Integer.toString(numberOfEach()[0]));
        ptsInQuestion = numberOfEach()[0];
    }

    private void endRollingButtonActionPerformed(ActionEvent evt) {
        int[] counts = numberOfEach();
        boolean flag1 = false;
        for (int count : counts)
            if (count == 5) {
                flag1 = true;
                break;
            }
        //checks if the circumstances call for a yahtzee bonus for each player
        if(flag1 && turn.equals("Player 1") && Integer.parseInt(yahtzeePointsP1.getText()) != 0 && Integer.parseInt(yahtzeeBonusP1.getText()) != 400)
        {
            int y = Integer.parseInt(yahtzeeBonusP1.getText());
            y += 100;
            yahtzeeBonusP1.setText(Integer.toString(y));
            y = Integer.parseInt(lowerSectionPointsP1.getText());
            y += 100;
            lowerSectionPointsP1.setText(Integer.toString(y));
            y = Integer.parseInt(grandTotalP1.getText());
            y += 100;
            grandTotalP1.setText(Integer.toString(y));
        }
        else if(flag1 && turn.equals("Player 2") && Integer.parseInt(yahtzeePointsP2.getText()) != 0 && Integer.parseInt(yahtzeeBonusP2.getText()) != 400)
        {
            int y = Integer.parseInt(yahtzeeBonusP2.getText());
            y += 100;
            yahtzeeBonusP2.setText(Integer.toString(y));
            y = Integer.parseInt(lowerSectionPointsP2.getText());
            y += 100;
            lowerSectionPointsP2.setText(Integer.toString(y));
            y = Integer.parseInt(grandTotalP2.getText());
            y += 100;
            grandTotalP2.setText(Integer.toString(y));
        }
        rollButton.setEnabled(false);
        endRollingButton.setEnabled(false);
        ArrayList<AbstractButton> l = Collections.list(buttonGroup1.getElements());
        for(AbstractButton b : l)
        {
            b.setEnabled(true);
        }
    }

    private void twosButtonP1ActionPerformed(ActionEvent evt) {
        endTurnButton.setVisible(true);
        yieldLabel.setText(Integer.toString(numberOfEach()[1] * 2));
        ptsInQuestion = numberOfEach()[1] * 2;
    }

    private void threesButtonP1ActionPerformed(ActionEvent evt) {
        endTurnButton.setVisible(true);
        yieldLabel.setText(Integer.toString(numberOfEach()[2] * 3));
        ptsInQuestion = numberOfEach()[2] * 3;
    }

    private void foursButtonP1ActionPerformed(ActionEvent evt) {
        endTurnButton.setVisible(true);
        yieldLabel.setText(Integer.toString(numberOfEach()[3] * 4));
        ptsInQuestion = numberOfEach()[3] * 4;
    }

    private void fivesButtonP1ActionPerformed(ActionEvent evt) {
        endTurnButton.setVisible(true);
        yieldLabel.setText(Integer.toString(numberOfEach()[4] * 5));
        ptsInQuestion = numberOfEach()[4] * 5;
    }

    private void sixesButtonP1ActionPerformed(ActionEvent evt) {
        endTurnButton.setVisible(true);
        yieldLabel.setText(Integer.toString(numberOfEach()[5] * 6));
        ptsInQuestion = numberOfEach()[5] * 6;
    }

    private void threeOfAKindButtonP1ActionPerformed(ActionEvent evt) {
        endTurnButton.setVisible(true);
        boolean flag = false;
        int[] nums = numberOfEach();
        for(int i = 0; i < 6; i++)
        {
            if(nums[i] > 2)
                flag = true;
        }

        if(flag)
            yieldLabel.setText(Integer.toString(sumOfAll()));
        else
            yieldLabel.setText(Integer.toString(0));
        ptsInQuestion = Integer.parseInt(yieldLabel.getText());
    }

    private void fourOfAKindButtonP1ActionPerformed(ActionEvent evt) {
        endTurnButton.setVisible(true);
        boolean flag = false;
        int[] nums = numberOfEach();
        for(int i = 0; i < 6; i++)
        {
            if(nums[i] > 3)
                flag = true;
        }

        if(flag)
            yieldLabel.setText(Integer.toString(sumOfAll()));
        else
            yieldLabel.setText(Integer.toString(0));
        ptsInQuestion = Integer.parseInt(yieldLabel.getText());
    }

    private void fullHouseButtonP1ActionPerformed(ActionEvent evt) {
        endTurnButton.setVisible(true);
        int[] counts = numberOfEach();
        boolean check2 = false;
        boolean check3 = false;
        for (int i: counts) {
            check2 |= (i==2);
            check3 |= (i==3);
        }

        if(check2 && check3)
            yieldLabel.setText(Integer.toString(25));
        else
            yieldLabel.setText(Integer.toString(0));
        ptsInQuestion = Integer.parseInt(yieldLabel.getText());
    }

    private void smallStraightButtonP1ActionPerformed(ActionEvent evt) {
        endTurnButton.setVisible(true);
        int[] counts = numberOfEach();
        //checks if there is any sequence of length 4 in the final roll
        if((counts[0] > 0 && counts[2] > 0 && counts[2] > 0 && counts[3] > 0) ||
                (counts[2] > 0 && counts[2] > 0 && counts[3] > 0 && counts[4] > 0) ||
                (counts[2] > 0 && counts[3] > 0 && counts[4] > 0 && counts[5] > 0))
            yieldLabel.setText(Integer.toString(30));
        else
            yieldLabel.setText(Integer.toString(0));
        ptsInQuestion = Integer.parseInt(yieldLabel.getText());
    }

    private void largeStraightButtonP1ActionPerformed(ActionEvent evt) {
        endTurnButton.setVisible(true);
        int[] counts = numberOfEach();
        //checks if there is any sequence of length 5 in the final roll
        if((counts[0] > 0 && counts[2] > 0 && counts[2] > 0 && counts[3] > 0 && counts[4] > 0) ||
                (counts[2] > 0 && counts[2] > 0 && counts[3] > 0 && counts[4] > 0 && counts[5] > 0))
            yieldLabel.setText(Integer.toString(40));
        else
            yieldLabel.setText(Integer.toString(0));
        ptsInQuestion = Integer.parseInt(yieldLabel.getText());
    }

    private void yahtzeeButtonP1ActionPerformed(ActionEvent evt) {
        endTurnButton.setVisible(true);
        int[] counts = numberOfEach();
        boolean flag1 = false;
        for(int i = 0; i < counts.length; i++)
            if(counts[i] == 5)
                flag1 = true;
        if(flag1)
            yieldLabel.setText(Integer.toString(50));
        else
            yieldLabel.setText(Integer.toString(0));
        ptsInQuestion = Integer.parseInt(yieldLabel.getText());
    }

    private void chanceButtonP1ActionPerformed(ActionEvent evt) {
        endTurnButton.setVisible(true);
        int pts = sumOfAll();
        yieldLabel.setText(Integer.toString(pts));
        ptsInQuestion = Integer.parseInt(yieldLabel.getText());
    }

    private void acesButtonP2ActionPerformed(ActionEvent evt) {
        acesButtonP1ActionPerformed(evt);
    }

    private void twosButtonP2ActionPerformed(ActionEvent evt) {
        twosButtonP1ActionPerformed(evt);
    }

    private void threesButtonP2ActionPerformed(ActionEvent evt) {
        threesButtonP1ActionPerformed(evt);
    }

    private void foursButtonP2ActionPerformed(ActionEvent evt) {
        foursButtonP1ActionPerformed(evt);
    }

    private void fivesButtonP2ActionPerformed(ActionEvent evt) {
        fivesButtonP1ActionPerformed(evt);
    }

    private void sixesButtonP2ActionPerformed(ActionEvent evt) {
        sixesButtonP1ActionPerformed(evt);
    }

    private void threeOfAKindButtonP2ActionPerformed(ActionEvent evt) {
        threeOfAKindButtonP1ActionPerformed(evt);
    }

    private void fourOfAKindButtonP2ActionPerformed(ActionEvent evt) {
        fourOfAKindButtonP1ActionPerformed(evt);
    }

    private void fullHouseButtonP2ActionPerformed(ActionEvent evt) {
        fullHouseButtonP1ActionPerformed(evt);
    }

    private void smallStraightButtonP2ActionPerformed(ActionEvent evt) {
        smallStraightButtonP1ActionPerformed(evt);
    }

    private void largeStraightButtonP2ActionPerformed(ActionEvent evt) {
        largeStraightButtonP1ActionPerformed(evt);
    }

    private void yahtzeeButtonP2ActionPerformed(ActionEvent evt) {
        yahtzeeButtonP1ActionPerformed(evt);
    }

    private void chanceButtonP2ActionPerformed(ActionEvent evt) {
        chanceButtonP1ActionPerformed(evt);
    }

    private void endTurnButtonActionPerformed(ActionEvent evt) {
        //calls applyPts in a way according to the button that was pressed
        if(acesButtonP1.isSelected())
            applyPts("Player 1", acesPointsP1, true);
        else if(twosButtonP1.isSelected())
            applyPts("Player 1", twosPointsP1, true);
        else if(threesButtonP1.isSelected())
            applyPts("Player 1", threesPointsP1, true);
        else if(foursButtonP1.isSelected())
            applyPts("Player 1", foursPointsP1, true);
        else if(fivesButtonP1.isSelected())
            applyPts("Player 1", fivesPointsP1, true);
        else if(sixesButtonP1.isSelected())
            applyPts("Player 1", sixesPointsP1, true);
        else if(threeOfAKindButtonP1.isSelected())
            applyPts("Player 1", threeOfAKindPointsP1, false);
        else if(fourOfAKindButtonP1.isSelected())
            applyPts("Player 1", fourOfAKindPointsP1, false);
        else if(fullHouseButtonP1.isSelected())
            applyPts("Player 1", fullHousePointsP1, false);
        else if(smallStraightButtonP1.isSelected())
            applyPts("Player 1", smallStraightPointsP1, false);
        else if(largeStraightButtonP1.isSelected())
            applyPts("Player 1", largeStraightPointsP1, false);
        else if(yahtzeeButtonP1.isSelected())
            applyPts("Player 1", yahtzeePointsP1, false);
        else if(chanceButtonP1.isSelected())
            applyPts("Player 1", chancePointsP1, false);
        else if(acesButtonP2.isSelected())
            applyPts("Player 2", acesPointsP2, true);
        else if(twosButtonP2.isSelected())
            applyPts("Player 2", twosPointsP2, true);
        else if(threesButtonP2.isSelected())
            applyPts("Player 2", threesPointsP2, true);
        else if(foursButtonP2.isSelected())
            applyPts("Player 2", foursPointsP2, true);
        else if(fivesButtonP2.isSelected())
            applyPts("Player 2", fivesPointsP2, true);
        else if(sixesButtonP2.isSelected())
            applyPts("Player 2", sixesPointsP2, true);
        else if(threeOfAKindButtonP2.isSelected())
            applyPts("Player 2", threeOfAKindPointsP2, false);
        else if(fourOfAKindButtonP2.isSelected())
            applyPts("Player 2", fourOfAKindPointsP2, false);
        else if(fullHouseButtonP2.isSelected())
            applyPts("Player 2", fullHousePointsP2, false);
        else if(smallStraightButtonP2.isSelected())
            applyPts("Player 2", smallStraightPointsP2, false);
        else if(largeStraightButtonP2.isSelected())
            applyPts("Player 2", largeStraightPointsP2, false);
        else if(yahtzeeButtonP2.isSelected())
            applyPts("Player 2", yahtzeePointsP2, false);
        else if(chanceButtonP2.isSelected())
            applyPts("Player 2", chancePointsP2, false);

        ArrayList<AbstractButton> l = Collections.list(buttonGroup1.getElements());
        for(AbstractButton b : l)
            if(b.isSelected())
                b.setVisible(false);


        yieldLabel.setText("-");
        turnNum++;
        for(AbstractButton b : l)
        {
            b.setEnabled(false);
        }
        for(JButton b : buttonList)
            b.setSelected(false);
        endTurnButton.setVisible(false);

        //checks if game is over
        if(turnNum == 26)
        {
            for(AbstractButton b : l)
                b.setVisible(false);
            gameOverLabel.setVisible(true);
            winnerLabel.setVisible(true);
            if(Integer.parseInt(grandTotalP1.getText()) > Integer.parseInt(grandTotalP2.getText()))
                winnerLabel.setText("Player 1 Won!");
            else if(Integer.parseInt(grandTotalP1.getText()) < Integer.parseInt(grandTotalP2.getText()))
                winnerLabel.setText("Player 2 Won!");
            else
                winnerLabel.setText("It's a Draw!");
        }
    }


    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Yahtzee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Yahtzee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Yahtzee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Yahtzee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //builds and displays the frame
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Yahtzee().setVisible(true);
            }
        });
    }

    private JRadioButton acesButtonP1;
    private JRadioButton acesButtonP2;
    private JLabel acesPointsP1;
    private JLabel acesPointsP2;
    private ButtonGroup buttonGroup1;
    private JRadioButton chanceButtonP1;
    private JRadioButton chanceButtonP2;
    private JLabel chancePointsP1;
    private JLabel chancePointsP2;
    private JLabel choiceYield;
    private JButton diceButton1;
    private JButton diceButton2;
    private JButton diceButton3;
    private JButton diceButton4;
    private JButton diceButton5;
    private JPanel diceInterface;
    private JLabel diceSelectedLabel;
    private JButton endRollingButton;
    private JButton endTurnButton;
    private JRadioButton fivesButtonP1;
    private JRadioButton fivesButtonP2;
    private JLabel fivesPointsP1;
    private JLabel fivesPointsP2;
    private JRadioButton fourOfAKindButtonP1;
    private JRadioButton fourOfAKindButtonP2;
    private JLabel fourOfAKindPointsP1;
    private JLabel fourOfAKindPointsP2;
    private JRadioButton foursButtonP1;
    private JRadioButton foursButtonP2;
    private JLabel foursPointsP1;
    private JLabel foursPointsP2;
    private JRadioButton fullHouseButtonP1;
    private JRadioButton fullHouseButtonP2;
    private JLabel fullHousePointsP1;
    private JLabel fullHousePointsP2;
    private JLabel gameOverLabel;
    private JPanel gameStatePanel;
    private JLabel grandTotalP1;
    private JLabel grandTotalP2;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel22;
    private JLabel jLabel23;
    private JLabel jLabel24;
    private JLabel jLabel25;
    private JLabel jLabel26;
    private JLabel jLabel27;
    private JLabel jLabel28;
    private JLabel jLabel29;
    private JLabel jLabel3;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JLabel jLabel32;
    private JLabel jLabel33;
    private JLabel jLabel34;
    private JLabel jLabel35;
    private JLabel jLabel36;
    private JLabel jLabel37;
    private JLabel jLabel38;
    private JLabel jLabel39;
    private JLabel jLabel4;
    private JLabel jLabel40;
    private JLabel jLabel41;
    private JLabel jLabel42;
    private JLabel jLabel43;
    private JLabel jLabel44;
    private JLabel jLabel5;
    private JLabel jLabel54;
    private JLabel jLabel55;
    private JLabel jLabel56;
    private JLabel jLabel57;
    private JLabel jLabel58;
    private JLabel jLabel59;
    private JLabel jLabel6;
    private JLabel jLabel60;
    private JLabel jLabel61;
    private JLabel jLabel62;
    private JLabel jLabel63;
    private JLabel jLabel64;
    private JLabel jLabel65;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JRadioButton largeStraightButtonP1;
    private JRadioButton largeStraightButtonP2;
    private JLabel largeStraightPointsP1;
    private JLabel largeStraightPointsP2;
    private JLabel lowerSectionPointsP1;
    private JLabel lowerSectionPointsP2;
    private JPanel player1Scorecard;
    private JPanel player2Scorecard;
    private JButton rollButton;
    private JLabel rollsLeftLabel;
    private JLabel secondUpperSectionTotalP1;
    private JLabel secondUpperSectionTotalP2;
    private JRadioButton sixesButtonP1;
    private JRadioButton sixesButtonP2;
    private JLabel sixesPointsP1;
    private JLabel sixesPointsP2;
    private JRadioButton smallStraightButtonP1;
    private JRadioButton smallStraightButtonP2;
    private JLabel smallStraightPointsP1;
    private JLabel smallStraightPointsP2;
    private JRadioButton threeOfAKindButtonP1;
    private JRadioButton threeOfAKindButtonP2;
    private JLabel threeOfAKindPointsP1;
    private JLabel threeOfAKindPointsP2;
    private JRadioButton threesButtonP1;
    private JRadioButton threesButtonP2;
    private JLabel threesPointsP1;
    private JLabel threesPointsP2;
    private JLabel totalP1;
    private JLabel totalP2;
    private JLabel turnLabel;
    private JRadioButton twosButtonP1;
    private JRadioButton twosButtonP2;
    private JLabel twosPointsP1;
    private JLabel twosPointsP2;
    private JLabel upperSectionBonusP1;
    private JLabel upperSectionBonusP2;
    private JLabel upperSectionP1;
    private JLabel upperSectionP2;
    private JLabel winnerLabel;
    private JLabel yahtzeeBonusP1;
    private JLabel yahtzeeBonusP2;
    private JRadioButton yahtzeeButtonP1;
    private JRadioButton yahtzeeButtonP2;
    private JLabel yahtzeePointsP1;
    private JLabel yahtzeePointsP2;
    private JLabel yieldLabel;
}




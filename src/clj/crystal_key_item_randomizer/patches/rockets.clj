(ns crystal-key-item-randomizer.patches.rockets)

(def trigger-early [{:label "AzaleaGymTriggerRockets.ckir_BEFORE_GoldenrodRockets",
                     :address_range {:begin 1633254, :end 1633258},
                     :description "Trigger Rocket events earlier",
                     :integer_values {:old [6 6 235 107], :new [6 3 235 107]}}
                    {:label "AzaleaGymTriggerRockets.ckir_BEFORE_RadioTowerRockets",
                     :address_range {:begin 1633250, :end 1633254},
                     :description "Trigger Rocket events earlier",
                     :integer_values {:old [6 7 238 107], :new [6 4 238 107]}}
                    {:label "BlackthornGymTriggerRockets.ckir_BEFORE_GoldenrodRockets",
                     :address_range {:begin 1658545, :end 1658549},
                     :description "Trigger Rocket events earlier",
                     :integer_values {:old [6 6 182 78], :new [6 3 182 78]}}
                    {:label "BlackthornGymTriggerRockets.ckir_BEFORE_RadioTowerRockets",
                     :address_range {:begin 1658541, :end 1658545},
                     :description "Trigger Rocket events earlier",
                     :integer_values {:old [6 7 185 78], :new [6 4 185 78]}}
                    {:label "CeladonGymTriggerRockets.ckir_BEFORE_GoldenrodRockets",
                     :address_range {:begin 470268, :end 470272},
                     :description "Trigger Rocket events earlier",
                     :integer_values {:old [6 6 1 109], :new [6 3 1 109]}}
                    {:label "CeladonGymTriggerRockets.ckir_BEFORE_RadioTowerRockets",
                     :address_range {:begin 470264, :end 470268},
                     :description "Trigger Rocket events earlier",
                     :integer_values {:old [6 7 4 109], :new [6 4 4 109]}}
                    {:label "CeruleanGymTriggerRockets.ckir_BEFORE_GoldenrodRockets",
                     :address_range {:begin 1606767, :end 1606771},
                     :description "Trigger Rocket events earlier",
                     :integer_values {:old [6 6 116 68], :new [6 3 116 68]}}
                    {:label "CeruleanGymTriggerRockets.ckir_BEFORE_RadioTowerRockets",
                     :address_range {:begin 1606763, :end 1606767},
                     :description "Trigger Rocket events earlier",
                     :integer_values {:old [6 7 119 68], :new [6 4 119 68]}}
                    {:label "CianwoodGymTriggerRockets.ckir_BEFORE_GoldenrodRockets",
                     :address_range {:begin 644744, :end 644748},
                     :description "Trigger Rocket events earlier",
                     :integer_values {:old [6 6 141 86], :new [6 3 141 86]}}
                    {:label "CianwoodGymTriggerRockets.ckir_BEFORE_RadioTowerRockets",
                     :address_range {:begin 644740, :end 644744},
                     :description "Trigger Rocket events earlier",
                     :integer_values {:old [6 7 144 86], :new [6 4 144 86]}}
                    {:label "EcruteakGymTriggerRockets.ckir_BEFORE_GoldenrodRockets",
                     :address_range {:begin 630203, :end 630207},
                     :description "Trigger Rocket events earlier",
                     :integer_values {:old [6 6 192 93], :new [6 3 192 93]}}
                    {:label "EcruteakGymTriggerRockets.ckir_BEFORE_RadioTowerRockets",
                     :address_range {:begin 630199, :end 630203},
                     :description "Trigger Rocket events earlier",
                     :integer_values {:old [6 7 195 93], :new [6 4 195 93]}}
                    {:label "FuchsiaGymTriggerRockets.ckir_BEFORE_GoldenrodRockets",
                     :address_range {:begin 1663034, :end 1663038},
                     :description "Trigger Rocket events earlier",
                     :integer_values {:old [6 6 63 96], :new [6 3 63 96]}}
                    {:label "FuchsiaGymTriggerRockets.ckir_BEFORE_RadioTowerRockets",
                     :address_range {:begin 1663030, :end 1663034},
                     :description "Trigger Rocket events earlier",
                     :integer_values {:old [6 7 66 96], :new [6 4 66 96]}}
                    {:label "GoldenrodGymTriggerRockets.ckir_BEFORE_GoldenrodRockets",
                     :address_range {:begin 344193, :end 344197},
                     :description "Trigger Rocket events earlier",
                     :integer_values {:old [6 6 134 64], :new [6 3 134 64]}}
                    {:label "GoldenrodGymTriggerRockets.ckir_BEFORE_RadioTowerRockets",
                     :address_range {:begin 344189, :end 344193},
                     :description "Trigger Rocket events earlier",
                     :integer_values {:old [6 7 137 64], :new [6 4 137 64]}}
                    {:label "MahoganyGymTriggerRockets.ckir_BEFORE_GoldenrodRockets",
                     :address_range {:begin 1678330, :end 1678334},
                     :description "Trigger Rocket events earlier",
                     :integer_values {:old [6 6 255 91], :new [6 3 255 91]}}
                    {:label "MahoganyGymTriggerRockets.ckir_BEFORE_RadioTowerRockets",
                     :address_range {:begin 1678326, :end 1678330},
                     :description "Trigger Rocket events earlier",
                     :integer_values {:old [6 7 2 92], :new [6 4 2 92]}}
                    {:label "OlivineGymTriggerRockets.ckir_BEFORE_GoldenrodRockets",
                     :address_range {:begin 639356, :end 639360},
                     :description "Trigger Rocket events earlier",
                     :integer_values {:old [6 6 129 65], :new [6 3 129 65]}}
                    {:label "OlivineGymTriggerRockets.ckir_BEFORE_RadioTowerRockets",
                     :address_range {:begin 639352, :end 639356},
                     :description "Trigger Rocket events earlier",
                     :integer_values {:old [6 7 132 65], :new [6 4 132 65]}}
                    {:label "PewterGymTriggerRockets.ckir_BEFORE_GoldenrodRockets",
                     :address_range {:begin 1714337, :end 1714341},
                     :description "Trigger Rocket events earlier",
                     :integer_values {:old [6 6 166 104], :new [6 3 166 104]}}
                    {:label "PewterGymTriggerRockets.ckir_BEFORE_RadioTowerRockets",
                     :address_range {:begin 1714333, :end 1714337},
                     :description "Trigger Rocket events earlier",
                     :integer_values {:old [6 7 169 104], :new [6 4 169 104]}}
                    {:label "SaffronGymTriggerRockets.ckir_BEFORE_GoldenrodRockets",
                     :address_range {:begin 1612936, :end 1612940},
                     :description "Trigger Rocket events earlier",
                     :integer_values {:old [6 6 141 92], :new [6 3 141 92]}}
                    {:label "SaffronGymTriggerRockets.ckir_BEFORE_RadioTowerRockets",
                     :address_range {:begin 1612932, :end 1612936},
                     :description "Trigger Rocket events earlier",
                     :integer_values {:old [6 7 144 92], :new [6 4 144 92]}}
                    {:label "SeafoamGymTriggerRockets.ckir_BEFORE_GoldenrodRockets",
                     :address_range {:begin 1750330, :end 1750334},
                     :description "Trigger Rocket events earlier",
                     :integer_values {:old [6 6 63 117], :new [6 3 63 117]}}
                    {:label "SeafoamGymTriggerRockets.ckir_BEFORE_RadioTowerRockets",
                     :address_range {:begin 1750326, :end 1750330},
                     :description "Trigger Rocket events earlier",
                     :integer_values {:old [6 7 66 117], :new [6 4 66 117]}}
                    {:label "VermilionGymTriggerRockets.ckir_BEFORE_GoldenrodRockets",
                     :address_range {:begin 1646832, :end 1646836},
                     :description "Trigger Rocket events earlier",
                     :integer_values {:old [6 6 245 96], :new [6 3 245 96]}}
                    {:label "VermilionGymTriggerRockets.ckir_BEFORE_RadioTowerRockets",
                     :address_range {:begin 1646828, :end 1646832},
                     :description "Trigger Rocket events earlier",
                     :integer_values {:old [6 7 248 96], :new [6 4 248 96]}}
                    {:label "VioletGymTriggerRockets.ckir_BEFORE_GoldenrodRockets",
                     :address_range {:begin 427047, :end 427051},
                     :description "Trigger Rocket events earlier",
                     :integer_values {:old [6 6 44 68], :new [6 3 44 68]}}
                    {:label "VioletGymTriggerRockets.ckir_BEFORE_RadioTowerRockets",
                     :address_range {:begin 427043, :end 427047},
                     :description "Trigger Rocket events earlier",
                     :integer_values {:old [6 7 47 68], :new [6 4 47 68]}}
                    {:label "ViridianGymTriggerRockets.ckir_BEFORE_GoldenrodRockets",
                     :address_range {:begin 633440, :end 633444},
                     :description "Trigger Rocket events earlier",
                     :integer_values {:old [6 6 101 106], :new [6 3 101 106]}}
                    {:label "ViridianGymTriggerRockets.ckir_BEFORE_RadioTowerRockets",
                     :address_range {:begin 633436, :end 633440},
                     :description "Trigger Rocket events earlier",
                     :integer_values {:old [6 7 104 106], :new [6 4 104 106]}}])

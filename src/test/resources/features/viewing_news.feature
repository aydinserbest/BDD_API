Feature: View news articles about different companies

  Rule: Should be able to view the most recent articles in reverse chronological order
    Example: Articles are displayed in order
      Given Tracy has a trading account
      And the following articles have been published:
        | date       | time  | headline                      |
        | 2018-05-23 | 22:25 | Will Earnings Normalize Soon? |
        | 2018-05-23 | 22:22 | NYT: Apple signs with Volkswagen to make self-driving cars |
        | 2018-05-23 | 20:03 | Tracking David Einhorn's Portfolio - Q1 2018 Update |
        | 2018-05-23 | 18:39 | Apple Watch shipments +35% in Q1 |
        | 2018-05-23 | 17:01 | Apple: Still A Bargain |
        | 2018-05-23 | 16:57 | Apple is giving a $50 credit to many iPhone owners who replaced the battery out of warranty |
        | 2018-05-23 | 15:39 | Apple is missing out on billions of dollars by skirting the hottest trend in software |
        | 2018-05-23 | 15:33 | Apple launches privacy portal for user data ahead of GDPR |
        | 2018-05-23 | 14:47 | How to share your location with loved ones so they know you're safe |
        | 2018-05-23 | 14:14 | Trading Mistake 8 (Apple): Poor Profit-Taking |
      When she views he latest news rticles
      Then the articles should be presented as follows:
        | date       | time  | headline                      |
        | 2018-05-23 | 22:25 | Will Earnings Normalize Soon? |
        | 2018-05-23 | 22:22 | NYT: Apple signs with Volkswagen to make self-driving cars |
        | 2018-05-23 | 20:03 | Tracking David Einhorn's Portfolio - Q1 2018 Update |
        | 2018-05-23 | 18:39 | Apple Watch shipments +35% in Q1 |
        | 2018-05-23 | 17:01 | Apple: Still A Bargain |
        | 2018-05-23 | 16:57 | Apple is giving a $50 credit to many iPhone owners who replaced the battery out of warranty |
        | 2018-05-23 | 15:39 | Apple is missing out on billions of dollars by skirting the hottest trend in software |
        | 2018-05-23 | 15:33 | Apple launches privacy portal for user data ahead of GDPR |
        | 2018-05-23 | 14:47 | How to share your location with loved ones so they know you're safe |
        | 2018-05-23 | 14:14 | Trading Mistake 8 (Apple): Poor Profit-Taking |




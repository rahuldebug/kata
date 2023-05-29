Instruction

Winning a Point Increases Score Correctly
As a tennis chair umpire
I want the score to increase according to Tennis rules when a player wins a point during the
first 3 points of each player
So that I can easily read and announce the current score to the players and the crowd
Given the score is 0:0
When the server wins a point
Then the score is 15:0
Given the score is 15:15
When the receiver wins a point
Then the score is 15:30
Given the score is 30:30
When the server wins a point
Then the score is 40:30


Deuce and Advantage are Scored Correctly
As a tennis chair umpire
I want deuce and advantage to be scored correctly
So that Ill can easill y read and announce the current score to the pilayers and the crowd
Given the score is 40:40
When the receiver wins a point
Then the score should be 40:A
Given the score is A:40
When the receiver wins a point
Then the score should be 40:40

Winning Points are Scored Correctlly
As a tennis chair umpire
I want the w nning point to be scored correctly
So that ll can easilly read and announce the cu rent score to the players and the crowd
Given the score is 40:30
When the server wins a point
Then the server should win
Given the score is 40:A
When the, receiver wins a point
Then the receiver shouId win

To Run the project  ./gradlew clean build 
to Run test suite ./gradlew test
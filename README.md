# Spotify Puzzles

Spotted these (No pun intended) and thought they might be fun to try.....using C instead of Java might make them a little more challenging except for the third one that should be 1 operation either way.

## 1. Cat vs. Dog
Choosing the maximum number of people that can be satisfied when voting on a reality tv show. The people will vote each week choosing 1 cat or dog to stay and one to leave. A cat lover is defined as a dog hater and vice versa

Sample input 1
2
1 1 2
C1 D1
D1 C1
1 2 4
C1 D1
C1 D1
C1 D2
D2 C1

Sample output 1
1
3


## 2. Zipf’s Song
Song ordering using Zipf's frequency algorithm. The likelihood of i occuring is 1 divided by position in a set. This means that the "quality" of something in a set where every option can be considered equal is the number of times it actually occured multiplied by it's position in the set.

Sample input 1
4 2
30 one
30 two
15 three
25 four

Sample output 1
four
two

Sample input 2
15 3
197812 re_hash
78906 5_4
189518 tomorrow_comes_today
39453 new_genious
210492 clint_eastwood
26302 man_research
22544 punk
19727 sound_check
17535 double_bass
18782 rock_the_house
198189 19_2000
13151 latin_simone
12139 starshine
11272 slow_country
10521 m1_a1

Sample output 2
19_2000
clint_eastwood
tomorrow_comes_today


## 3. Reversed Binary Numbers
When considering a number as binary flip the bits. Can be one operation (^ or not, whichever you want to call it), but here is a more long winded way of getting to the same thing.  

Sample input 1
13

Sample output 1
11

Sample input 2
47

Sample output 2
61

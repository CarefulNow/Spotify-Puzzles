# Spotify Puzzles

Spotted these (No pun intended) and thought they might be fun to try.....using C instead of Java might make them a little more challenging except for the third one that should be 1 operation either way.

## 1. Cat vs. Dog
Choosing the maximum number of people that can be satisfied when voting on a reality tv show. The people will vote each week choosing 1 cat or dog to stay and one to leave. A cat lover is defined as a dog hater and vice versa

Sample input 1<br/>
2<br/>
1 1 2<br/>
C1 D1<br/>
D1 C1<br/>
1 2 4<br/>
C1 D1<br/>
C1 D1<br/>
C1 D2<br/>
D2 C1<br/>
<br/>
Sample output 1<br/>
1<br/>
3<br/>


## 2. Zipf’s Song
Song ordering using Zipf's frequency algorithm. The likelihood of i occuring is 1 divided by position in a set. This means that the "quality" of something in a set where every option can be considered equal is the number of times it actually occured multiplied by it's position in the set.

Sample input 1<br/>
4 2<br/>
30 one<br/>
30 two<br/>
15 three<br/>
25 four<br/>
<br/>
Sample output 1<br/>
four<br/>
two<br/>
<br/>
Sample input 2<br/>
15 3<br/>
197812 re_hash<br/>
78906 5_4<br/>
189518 tomorrow_comes_today<br/>
39453 new_genious<br/>
210492 clint_eastwood<br/>
26302 man_research<br/>
22544 punk<br/>
19727 sound_check<br/>
17535 double_bass<br/>
18782 rock_the_house<br/>
198189 19_2000<br/>
13151 latin_simone<br/>
12139 starshine<br/>
11272 slow_country<br/>
10521 m1_a1<br/>
<br/>
Sample output 2<br/>
19_2000<br/>
clint_eastwood<br/>
tomorrow_comes_today<br/>


## 3. Reversed Binary Numbers
When considering a number as binary flip the bits. Can be one operation (^ or not, whichever you want to call it), but here is a more long winded way of getting to the same thing.  

Sample input 1<br/>
13<br/>
<br/>
Sample output 1<br/>
11<br/>
<br/>
Sample input 2<br/>
47<br/>
<br/>
Sample output 2<br/>
61<br/>

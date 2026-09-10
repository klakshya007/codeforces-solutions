<h2><a href="https://codeforces.com/contest/1335/problem/A" target="_blank" rel="noopener noreferrer">1335A — Candies and Two Sisters</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1335A](https://codeforces.com/contest/1335/problem/A) |

## Topics
`math`

---

## Problem Statement

<div class="header" bis_skin_checked="1"><div class="title" bis_skin_checked="1">A. Candies and Two Sisters</div><div class="time-limit" bis_skin_checked="1"><div class="property-title" bis_skin_checked="1">time limit per test</div>1 second</div><div class="memory-limit" bis_skin_checked="1"><div class="property-title" bis_skin_checked="1">memory limit per test</div>256 megabytes</div><div class="input-file input-standard" bis_skin_checked="1"><div class="property-title" bis_skin_checked="1">input</div>standard input</div><div class="output-file output-standard" bis_skin_checked="1"><div class="property-title" bis_skin_checked="1">output</div>standard output</div></div><div bis_skin_checked="1"><p>There are two sisters Alice and Betty. You have $$$n$$$ candies. You want to distribute these $$$n$$$ candies between two sisters in such a way that:</p><ul> <li> Alice will get $$$a$$$ ($$$a  \gt  0$$$) candies; </li><li> Betty will get $$$b$$$ ($$$b  \gt  0$$$) candies; </li><li> each sister will get some <span class="tex-font-style-bf">integer</span> number of candies; </li><li> Alice will get a greater amount of candies than Betty (i.e. $$$a  \gt  b$$$); </li><li> all the candies will be given to one of two sisters (i.e. $$$a+b=n$$$). </li></ul><p>Your task is to calculate the number of ways to distribute exactly $$$n$$$ candies between sisters in a way described above. Candies are indistinguishable.</p><p>Formally, find the number of ways to represent $$$n$$$ as the sum of $$$n=a+b$$$, where $$$a$$$ and $$$b$$$ are positive integers and $$$a \gt b$$$.</p><p>You have to answer $$$t$$$ independent test cases.</p></div><div class="input-specification" bis_skin_checked="1"><div class="section-title" bis_skin_checked="1">Input</div><p>The first line of the input contains one integer $$$t$$$ ($$$1 \le t \le 10^4$$$) — the number of test cases. Then $$$t$$$ test cases follow.</p><p>The only line of a test case contains one integer $$$n$$$ ($$$1 \le n \le 2 \cdot 10^9$$$) — the number of candies you have.</p></div><div class="output-specification" bis_skin_checked="1"><div class="section-title" bis_skin_checked="1">Output</div><p>For each test case, print the answer — the number of ways to distribute exactly $$$n$$$ candies between two sisters in a way described in the problem statement. If there is no way to satisfy all the conditions, print $$$0$$$.</p></div><div class="sample-tests" bis_skin_checked="1"><div class="section-title" bis_skin_checked="1">Example</div><div class="sample-test" bis_skin_checked="1"><div class="input" bis_skin_checked="1"><div class="title" bis_skin_checked="1">Input<div title="Copy" data-clipboard-target="#id005594224520220753" id="id006215705159741709" class="input-output-copier" bis_skin_checked="1">Copy</div></div><pre id="id005594224520220753">6
7
1
2
3
2000000000
763243547
</pre></div><div class="output" bis_skin_checked="1"><div class="title" bis_skin_checked="1">Output<div title="Copy" data-clipboard-target="#id00655734410963361" id="id001303882476889674" class="input-output-copier" bis_skin_checked="1">Copy</div></div><pre id="id00655734410963361">3
0
0
1
999999999
381621773
</pre></div></div></div><div class="note" bis_skin_checked="1"><div class="section-title" bis_skin_checked="1">Note</div><p>For the test case of the example, the $$$3$$$ possible ways to distribute candies are:</p><ul> <li> $$$a=6$$$, $$$b=1$$$; </li><li> $$$a=5$$$, $$$b=2$$$; </li><li> $$$a=4$$$, $$$b=3$$$. </li></ul></div>
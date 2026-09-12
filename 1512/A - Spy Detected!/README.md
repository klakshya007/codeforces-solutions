<h2><a href="https://codeforces.com/contest/1512/problem/A" target="_blank" rel="noopener noreferrer">1512A — Spy Detected!</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1512A](https://codeforces.com/contest/1512/problem/A) |

## Topics
`brute force` `implementation`

---

## Problem Statement

<div class="header" bis_skin_checked="1"><div class="title" bis_skin_checked="1">A. Spy Detected!</div><div class="time-limit" bis_skin_checked="1"><div class="property-title" bis_skin_checked="1">time limit per test</div>2 seconds</div><div class="memory-limit" bis_skin_checked="1"><div class="property-title" bis_skin_checked="1">memory limit per test</div>256 megabytes</div><div class="input-file input-standard" bis_skin_checked="1"><div class="property-title" bis_skin_checked="1">input</div>standard input</div><div class="output-file output-standard" bis_skin_checked="1"><div class="property-title" bis_skin_checked="1">output</div>standard output</div></div><div bis_skin_checked="1"><p>You are given an array $$$a$$$ consisting of $$$n$$$ ($$$n \ge 3$$$) positive integers. It is known that in this array, all the numbers except one are the same (for example, in the array $$$[4, 11, 4, 4]$$$ all numbers except one are equal to $$$4$$$).</p><p>Print the index of the element that does not equal others. The numbers in the array are numbered from one.</p></div><div class="input-specification" bis_skin_checked="1"><div class="section-title" bis_skin_checked="1">Input</div><p>The first line contains a single integer $$$t$$$ ($$$1 \le t \le 100$$$). Then $$$t$$$ test cases follow.</p><p>The first line of each test case contains a single integer $$$n$$$ ($$$3 \le n \le 100$$$) — the length of the array $$$a$$$.</p><p>The second line of each test case contains $$$n$$$ integers $$$a_1, a_2, \ldots, a_n$$$ ($$$1 \le a_i \le 100$$$).</p><p>It is guaranteed that all the numbers except one in the $$$a$$$ array are the same.</p></div><div class="output-specification" bis_skin_checked="1"><div class="section-title" bis_skin_checked="1">Output</div><p>For each test case, output a single integer — the index of the element that is not equal to others.</p></div><div class="sample-tests" bis_skin_checked="1"><div class="section-title" bis_skin_checked="1">Example</div><div class="sample-test" bis_skin_checked="1"><div class="input" bis_skin_checked="1"><div class="title" bis_skin_checked="1">Input<div title="Copy" data-clipboard-target="#id0040349090340507976" id="id002998983185779347" class="input-output-copier" bis_skin_checked="1">Copy</div></div><pre id="id0040349090340507976">4
4
11 13 11 11
5
1 4 4 4 4
10
3 3 3 3 10 3 3 3 3 3
3
20 20 10
</pre></div><div class="output" bis_skin_checked="1"><div class="title" bis_skin_checked="1">Output<div title="Copy" data-clipboard-target="#id00866350098996261" id="id0012975231118105812" class="input-output-copier" bis_skin_checked="1">Copy</div></div><pre id="id00866350098996261">2
1
5
3
</pre></div></div></div>
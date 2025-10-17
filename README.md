<h1 style="text-align: center;">DATA STRUCTURES LAB HOMEWORK</h1>
<h3 style="text-align: center;">by İris Koca</h3>
<div>
  <h3>Example-1</h3>
  <p>The main reason the code produces this output is the operating principle of the Max Heap data structure.
  A Max Heap has two fundamental rules:
    The largest element is always at the top (the root).
    Any parent node is always greater than or equal to its child nodes.</p>
</div>
<div>
  <h3>Example-2</h3>
  <p>The overall time complexity (Big O) of this code is O(nlogn).
    This is because the slowest-running part of the code is the while loop, which pops elements off the stack one by one.</p>
</div>
<div>
  <h3>Example-3</h3>
  <p>The basic idea is to completely reverse the comparison logic.
    In a Max Heap, the goal is always to find the largest and move it to the top. In a Min Heap, the goal is to find the smallest and move it to the top. We made this change by simply changing the comparison operators (< and >) inside two critical methods in the code.</p>
</div>

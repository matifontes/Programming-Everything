#include <bits/stdc++.h>

using namespace std;

vector<string> split_string(string);

// Complete the kangaroo function below.
string kangaroo(int x1, int v1, int x2, int v2) {
    string result = "NO";
    bool canReachIt = (v2 < v1);
    if(canReachIt) {
        bool intersect = (x1 - x2) % (v1 - v2) == 0;
        if(intersect) {
            result = "YES";
        }
    }
    return result;
}

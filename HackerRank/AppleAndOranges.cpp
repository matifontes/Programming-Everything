#include <bits/stdc++.h>
using namespace std;

vector<string> split_string(string);

int countApples(int s, int t, int a, vector<int> apples){
    int res = 0;
    int pos = 0;
    for(int i=0; i < apples.size(); i++) {
        pos = apples[i] + a;
        if(pos >= s && pos <= t) {
            res++;
        } 
    }
    return res;
}

int countOranges(int s, int t, int b, vector<int> oranges){
    int res = 0;
    int pos = 0;
    for(int i=0; i < oranges.size(); i++) {
        pos = oranges[i] + b;
        if(pos >= s && pos <= t) {
            res++;
        } 
    }
    return res;
}


// Complete the countApplesAndOranges function below.
void countApplesAndOranges(int s, int t, int a, int b, vector<int> apples, vector<int> oranges) {
    int applesSum = countApples(s, t, a, apples);
    int orangesSum = countOranges(s, t, b, oranges);

    cout<< applesSum << endl;
    cout<< orangesSum;
}

vector<int> gradingStudents(vector<int> grades) {
    vector<int> res(grades.size(), 0);
    for(int i=0; i<grades.size(); i++){
        if(grades[i] < 38){
            res[i] = grades[i];
        }
        else if(((grades[i] + 1) % 5) == 0){
            res[i] = grades[i] + 1;
        }
        else if(((grades[i] + 2 ) % 5) == 0){
            res[i] = grades[i] + 2;
        }
        else {
            res[i] = grades[i];
        }
    }
    return res;
}

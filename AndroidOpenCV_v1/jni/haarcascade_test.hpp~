#ifndef __haar_test
#define __haar_test

#include <string>
#include <sstream>
#include <iostream>
#include "opencv2/imgproc/types_c.h"
#include "opencv2/imgproc/imgproc.hpp"
#include "opencv2/contrib/contrib.hpp"
#include "opencv/cv.h"
#include <stdlib.h>
#include <vector>
#include <stack>
#include <iostream>
#include <map>
#include <ctime>
#include <string.h>
#include <string>

#include <stdlib.h>
#include <vector>
#include <stack>
#include <iostream>
#include <map>
#include <ctime>

using namespace std;
using namespace cv;

class haarcascade
    {

    private:
        String face_cascade_name ;
        String eyes_cascade_name ;
        CascadeClassifier face_cascade;


        //constructor for class which loads the cascade files
    public:

        haarcascade();                

        haarcascade(char * name);
      
        //method to detect faces in the image fram
        int detect(Mat &frame);

    };



#endif

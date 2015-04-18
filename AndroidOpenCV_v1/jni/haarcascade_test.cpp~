#include "haarcascade_test.hpp"



        haarcascade::haarcascade()
        {

        }

haarcascade::haarcascade(char * name)
{
            face_cascade_name=name;
            //-- 1. Load the cascades
            if( !face_cascade.load( face_cascade_name ) )
            {
                printf("--(!)Error loading\n");
            };

}


        int haarcascade::detect(Mat &frame)
        {
            int flag=0;
            Mat f1(240/2,320/2,frame.type ());
            cv::flip(frame,frame,1);
            cv::resize(frame,f1,f1.size(),0,0,INTER_CUBIC);
            //cv::flip(f1,f1,1);

            //ROI of face locations
            std::vector<Rect> faces;
            Mat frame_gray;

            //converting to grayscale
            cvtColor( f1, frame_gray, CV_BGR2GRAY );
            //pre processing frame using histogram equalization
            equalizeHist( frame_gray, frame_gray );
            //-- multiscale detection of faces
            face_cascade.detectMultiScale( frame_gray, faces, 1.1, 2, 0|CV_HAAR_SCALE_IMAGE, Size(30, 30) );
               for( int i = 0; i < faces.size(); i++ )
               {
                   Point center( faces[i].x + faces[i].width*0.5, faces[i].y + faces[i].height*0.5 );
                   int scalex=frame.cols/f1.cols;
                   int scaley=frame.rows/f1.rows;
                   Point ncenter;
                   ncenter.x=center.x*scalex;
                   ncenter.y=center.y*scaley;
                   ellipse( frame, ncenter, Size( faces[i].width*0.5*scalex, faces[i].height*0.5*scaley), 0, 0, 360, Scalar( 255, 0, 255 ), -1);
               }
               //cvtColor(frame_gray,f1,CV_GRAY2BGR);
               //cv::resize (f1,frame,frame.size(),0,0,INTER_CUBIC);
               flag=1;
               return flag;
        }

      

# from werkzeug.utils import secure_filename
import os
# from database import create_student, create_teacher, query_teacher_username, query_student_username, query_teachers, query_students
# from database import create_quizes, get_quizes, get_arab_quizes, get_hebrew_quizes, get_quizes_by_owner, query_arab_teachers, query_hebrew_teachers
# from database import query_teacher_id, create_post, query_posts, query_posts_teacher, create_course, query_courses, query_courses_teacher
# from database import query_course_id, get_amount_buyers_id, update_buyers, update_teacher_buyers, update_teacher_courses
# from database import query_teacher_email, query_student_email, query_courses_level, add_advertiser, query_advertisers, get_rating_teacher, update_rating
# from database import add_online, remove_online, get_online
# from database import *
# from flask_mail import Mail, Message
import random
import paypalrestsdk

print("yoooo")
import socket
def main():
    i = 0
    server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    #setting the server
    HOST_NAME = '0.0.0.0'
    PORT = 8888
    print("yoooo")
    adress1 = socket.gethostbyname("https://lftserver.herokuapp.com")
    server_socket.bind((adress1, 12345))
    print("yoooo")
    server_socket.listen(12)
    print("yoooo")
    server_name = "Language For Two"
    name = "not yet defined!"
    while(i<1):
        print("heyyyy")
        client_socket, adress = server_socket.accept()
        print("heyyyy")
        data = client_socket.recv(1024)
        print(data)
        data_len = len(data)
        # students = query_students()
        username = data.split(",")[0]
        password = data.split(",")[-1]
        response = "not confirmed"
        # for student in students:
        #     if student.username == username:
        #         if student.password == password:
        #             response = "confirmed"

        client_socket.send(response)

    server_socket.close()
    client_socket.close()
if __name__ == '__main__':
    main()

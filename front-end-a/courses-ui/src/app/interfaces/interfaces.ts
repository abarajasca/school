export interface Course {
  id:      number;
  name:    string;
  teacher: string;
}

export interface Student {
  id: number,
  name: string,
  id_course: number
}
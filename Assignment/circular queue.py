class Circular_Queue():

    def __init__(self, size):
        self.size = size
        self.queue = [None] * size
        self.front = self.rear = -1

   
    def enqueue(self, data):

        if ((self.rear + 1) % self.size == self.front):
            print("IS FULL\n")

        elif (self.front == -1):
            self.front = 0
            self.rear = 0
            self.queue[self.rear] = data
        else:
            self.rear = (self.rear + 1) % self.size
            self.queue[self.rear] = data


    def dequeue(self):
        if (self.front== -1):
            print("IS EMPTY\n")

        elif (self.front == self.rear):
            temp = self.queue[self.front]
            self. front= -1
            self.rear= -1
            return temp
        else:
            temp = self.queue[self.front]
            self.front = (self.front + 1) % self.size
            return temp


    def display(self):
        if(self.front == -1):
            print("NOTHING TO DISPLAY")

        elif (self.rear >= self.front):
            for i in range(self.front, self.rear + 1):
                print(self.queue[i], end=" ")
            print()
        else:
            for i in range(self.front, self.size):
                print(self.queue[i], end=" ")
            for i in range(0, self.size + 1):
                print(self.queue[i], end=" ")
            print()


    
obj = Circular_Queue(5)
obj.enqueue(1)
obj.enqueue(2)
obj.enqueue(3)
obj.enqueue(4)
obj.enqueue(5)

print("Queue is :")
obj.display()

obj.dequeue()
obj.dequeue()

obj.display()

        

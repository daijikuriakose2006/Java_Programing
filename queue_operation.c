#include<stdio.h>
#include<stdlib.h>
#define MAX 3
int rear = - 1 ;
int front = - 1 ;
void enQueue(int q[],int item){
if(rear==MAX-1){ 
printf("The queue is full\n");
return;
rear++;
} 
q[rear]=item; front=0; 
} 
if (front==-1){
} 
void deQueue(int q[])
{ 
printf("The queue is empty\n"); 
return; 
if(front==-1||front>= MAX ){ 
printf("The element deleted is %d\n",q[front]); 
front++;
}
void display(int q[])
{ 
printf("^ prime prime ln^ prime", prime );
if (rear== - 1 || front>rear)
{ 
printf("queue is Empty\n"); 
}
}
}
else {
printf("The queue is: ");
for(int i=front;i<=rear;i++)
{ 
printf("%d ",q[i]);
}
printf("\n");
int main(){
int queue [MAX],n;
while(1){
printf("Enter the operation required\n");
printf("=======

printf("1.enque\n2.deque\n3.Display\n4.exit\n");

==========\n");

printf("==============

fflush(stdin);

scanf("%d",&n);

switch(n){

case 1:

printf("Enter the item to push : ");

int item;

scanf("%d",&item);

enQueue(queue, item);

display(queue);

break;

case 2:

deQueue(queue);

display(queue);

break;

case 3:

display(queue);

break;

case 4:

printf("\n========Program terminated========");

exit(0);

default:

printf("Invalid selection");

}

}

return 0;

}


import math
import tkinter as tk
import sys 
import os
# Root Creation
root = tk.Tk()

# Global variable to help with the wait_variable func
global helper_var
helper_var = tk.BooleanVar()
helper_var.set(False)

def on_mouse_click(event, point):
    point[0] = event.x
    point[1] = event.y

    if helper_var.get() == False:
        helper_var.set(True)
    else:
        helper_var.set(False)


def refresh_view(canvas,delay):
    canvas.update_idletasks()
    canvas.update()
    root.after(delay)


def move_obj(x, y, canvas, obj):
    if obj != canvas:
        canvas.move(obj, x, y)
    else:
        scroll_region = canvas.cget("scrollregion")
        scroll_region_x1 = float(scroll_region.split(" ")[0])
        scroll_region_y1 = float(scroll_region.split(" ")[1])
        scroll_region_x2 = float(scroll_region.split(" ")[2])
        scroll_region_y2 = float(scroll_region.split(" ")[3])
        canvas.configure(scrollregion=(scroll_region_x1 + x, scroll_region_y1 + y, scroll_region_x2 + x, scroll_region_y2 + y))


view = tk.Canvas(root, width=401, height=401, bg="wheat")
view.pack(fill="both", expand=True)
height = int(view.cget("height"))
width = int(view.cget("width"))
view.configure(scrollregion=(-width/2,-height/2, width/2, height/2))
view.xview_moveto(.5)
view.yview_moveto(.5)
root.title("Illustrating the rectangle shape") 

view.create_rectangle(10 + -100, 0 + -30, 10 + 100, 0 + 30, fill= "blue")
pacman = view.create_arc(0 + -25, 0 + -25, 0 + 25, 0 + 25, fill= "pink", start= 30, extent= 300)
refresh_view(view, 0)
for i in range(0, 11):
	view.itemconfig(pacman, start=1, extent=359)
	refresh_view(view, 20)
	view.itemconfig(pacman, start=30, extent=300)
	refresh_view(view, 25)
	move_obj(10,0,view,pacman)
	move_obj(10,0,view,view)
	refresh_view(view, 0)
print("Press any mouse button to quit")
pos =[0,0]
root.bind("<Button-1>", lambda event: on_mouse_click(event, pos))
root.wait_variable(helper_var)
view.destroy()
root.destroy()


root.mainloop()